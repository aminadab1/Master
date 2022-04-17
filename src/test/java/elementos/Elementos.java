package elementos;

import org.openqa.selenium.By;

 public class Elementos {
 private By btnAbrirConta = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/header/div/div/div[3]/div/button");
 private By Camponome = By.id("nome");
 private By CampoTelefone = By.id("celular");
 private By CampoEmail = By.id("email");
 private By Campocpf = By.id("cpf");
 private By CampoDataDeNascimento = By.id("dataNascimento");
 private By CampoPrivacidade = By.xpath("/html/body/div[4]/div[2]/div/div[2]/form/div/div[6]/div/label");
 private By CampoContinuar = By.xpath("/html/body/div[4]/div[2]/div/div[2]/form/div/div[7]/butto");
 public By getBtnAbrirConta() {
	return btnAbrirConta;
}
public void setBtnAbrirConta(By btnAbrirConta) {
	this.btnAbrirConta = btnAbrirConta;
}
public By getCamponome() {
	return Camponome;
}
public void setCamponome(By camponome) {
	Camponome = camponome;
}
public By getCampoTelefone() {
	return CampoTelefone;
}
public void setCampoTelefone(By campoTelefone) {
	CampoTelefone = campoTelefone;
}
public By getCampoEmail() {
	return CampoEmail;
}
public void setCampoEmail(By campoEmail) {
	this.CampoEmail = campoEmail;
}
public By getCampocpf() {
	return Campocpf;
}
public void setCampocpf(By campocpf) {
	Campocpf = campocpf;
}
public By getCampoDataDeNascimento() {
	return CampoDataDeNascimento;
}
public void setCampoDataDeNascimento(By campoDataDeNascimento) {
	CampoDataDeNascimento = campoDataDeNascimento;
}
public By getCampoPrivacidade() {
	return CampoPrivacidade;
}
public void setCampoPrivacidade(By campoPrivacidade) {
	CampoPrivacidade = campoPrivacidade;
}
public By getCampoContinuar() {
	return CampoContinuar;
}
public void setCampoContinuar(By campoContinuar) {
	CampoContinuar = campoContinuar;
}

}
