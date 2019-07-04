package br.com.blz.testjava;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.blz.testjava.model.Produto;
import br.com.blz.testjava.repository.ProdutoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJavaApplicationTests {

	@Test
	public void contextLoads() {
	}
	 @Autowired
	    private ProdutoRepository produtoRepository;
	    
/*    @Test
    public void createProduct() {
    	
    	Produto produto = new Produto();
    	produto.setSku(43264);
    	produto.setName("LOREAL");
    	produto.setInventory(null);
    	produto.setMarketable(true);
    	
    	produtoRepository.save(produto);
        List<Produto> produtos = (List<Produto>) produtoRepository.findAll();
        for(Produto str : produtos){
        	System.out.println(str.getSku());
        	System.out.println(str.getName());
        	System.out.println(str.getInventory());
        	System.out.println(str.isMarketable());
        }

    }  */  

  /*  @Test
    public void deleteProduct() {
    	Produto produto = produtoRepository.findBySku(43264);
    	if(produto != null){
    		produtoRepository.delete(produto.getId());
    	}
    	System.out.println("O produto Id: [43264] foi removido");
    }
    
    @Test
    public void SaveOrUpdateProduct() {
    	Produto produto = produtoRepository.findBySku(43264);
    	if(produto != null){
    		produto.setName("PRODUTO");
    		produtoRepository.save(produto);
    		System.out.println("O produto Id: [43264] foi atualizado");
    	}else{
			Produto novoProduto = new Produto();
			novoProduto.setSku(43264);
			novoProduto.setName("PRODUTO 10");
			novoProduto.setInventory(null);
			novoProduto.setMarketable(false);
    		produtoRepository.save(novoProduto);
    		System.out.println("O produto Id: [43264] foi atualizado");
    	}
    }
    */
}
