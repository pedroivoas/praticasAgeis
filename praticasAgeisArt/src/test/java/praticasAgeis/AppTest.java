package praticasAgeis;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void verificaParTe() {
    	List<String> jogador1 = new ArrayList<String>();
    	jogador1.add("5H");
    	jogador1.add("5C");
    	jogador1.add("6S");
    	jogador1.add("7S");
    	jogador1.add("KD");
    	
    	List<String> jogador2 = new ArrayList<String>();
    	jogador2.add("2C");
    	jogador2.add("3S");
    	jogador2.add("8S");
    	jogador2.add("8D");
    	jogador2.add("TD");
    	
    	Poker pokerComparator = new Poker();
    	String ganhardor = pokerComparator.compare(jogador1, jogador2);
    	
    	assertTrue(ganhardor.equals("Jogador 2"));
    	
    }
    
}
