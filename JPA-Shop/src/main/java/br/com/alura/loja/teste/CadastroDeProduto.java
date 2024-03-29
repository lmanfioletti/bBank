package br.com.alura.loja.teste;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;


public class CadastroDeProduto {

    public static void main(String[] args) {
        CadastrarProduto();
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);

        Produto p = produtoDao.buscarPorId(1l);
        System.out.println(p.getPreco());

        //List<Produto> todosProdutos = produtoDao.buscarTodos();
        List<Produto> todosProdutos = produtoDao.buscarPorNomeDaCategoria("CELULARES");
        todosProdutos.forEach(p2 -> System.out.println(p.getNome()));



    }

    public static void CadastrarProduto() {
            Categoria celulares = new Categoria("CELULARES");
            Produto celular = new Produto("Galaxy S6", "barato velho e bom", new BigDecimal("500"), celulares);

            EntityManager em = JPAUtil.getEntityManager();
            ProdutoDao produtoDao = new ProdutoDao(em);
            CategoriaDao categoriaDao = new CategoriaDao(em);

            em.getTransaction().begin();
            categoriaDao.cadastrar(celulares);
            produtoDao.cadastrar(celular);
            em.getTransaction().commit();
            em.close();

    }
}



