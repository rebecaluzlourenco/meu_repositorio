
package batalhapoo;

public class Pokemon {
    //ATRIBUTOS ENCAPSULADOS
    private String nome;
    private String tipo;
    private int level;
    private int vida;
    private int ataque;
    private int defesa;
    
    //CONSTRUTOR

    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        
        calculaAtributos();
        imprimePokemon();     
      
    }
    
    //MÉTODOS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
    public void imprimePokemon(){
        System.out.println("Nome: " + nome + " | " +
                           "Tipo: " + nome + " | " +
                           "Level: " + level + " | " +
                           "Vida: " + vida + " | " +
                           "Ataque: " + ataque + " | " +
                           "Defesa: " + defesa + " | " );
    }


public void calculaAtributos(){
    switch(tipo){
        case "Agua":
            this.vida = 100;
            this.ataque = 48;
            this.defesa = 65;
        break;
        
        case "Eletrico":
            this.vida = 100;
            this.ataque = 55;
            this.defesa = 40;
        break;
        
        case "Terra":
            this.vida = 100;
            this.ataque = 75;
            this.defesa = 85;
        break;
        
        case "Fogo":
            this.vida = 100;
            this.ataque = 116;
            this.defesa = 93;
        break;

        case "Grama":
            this.vida = 100;
            this.ataque = 49;
            this.defesa = 49;
        break;
        
        case "Psiquico":
            this.vida = 100;
            this.ataque = 75;
            this.defesa = 110;
        break;
}
}
}