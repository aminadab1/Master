package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import elementos.Elementos;
import metodos.Metodos;

public class Steps{ 
Metodos m = new Metodos();
Elementos e = new Elementos();

@Dado("^que o usuario acesse a url \"([^\"]*)\"$")
public void que_o_usuario_acesse_a_url(String site) throws Throwable {
   m.ExecutarNavegador(site);
   
}   

@Dado("^selecione o campo abra a sua conta$")
public void selecione_o_campo_abra_a_sua_conta() throws Throwable {
	m.pausa(1000);
    m.clicar(e.getBtnAbrirConta());
    m.pausa(1000);
}

@Dado("^preencha os dados$")
public void preencha_os_dados() throws Throwable {
	
    m.clicar(e.getCamponome());
    m.pausa(1000);
    m.clicar(e.getCampoTelefone());
    m.pausa(1000);
    m.clicar(e.getCampoEmail());
    m.pausa(1000);
    m.clicar(e.getCampocpf());
    m.pausa(1000);
    m.clicar(e.getCampoDataDeNascimento());
    m.pausa(1000);
    
    
}

@Dado("^selecione a politica de privacidade$")
public void selecione_a_politica_de_privacidade() throws Throwable {
    m.clicar(e.getCampoPrivacidade());
    m.pausa(1000);
}

@Quando("^selecionar o botao continuar$")
public void selecionar_o_botao_continuar() throws Throwable {
    m.clicar(e.getCampoPrivacidade());
    m.pausa(1000);
}

@Entao("^realizo a validacao do texto Prontinho! Recebemos os seus dado$")
public void realizo_a_validacao_do_texto_Prontinho_Recebemos_os_seus_dado() throws Throwable {
    
}
}
