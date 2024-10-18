public class Autocarro
{
    String matricula;
    int kms;
    
    public Autocarro(String m) {
        this.matricula = m;
        this.kms = 0;
    
    }
    
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(String novaMatricula){
        this.matricula = novaMatricula;
    }
    
     public int getKms(){
        return this.kms;
    }
    public void setKms(int kmsAndados){
        this.kms = this.kms + kmsAndados;
    }
    
    
    
    
    public boolean verificaParImpar(int valorAVerificar){
        if(valorAVerificar % 2 == 0){
           return true; 
        } else {
            return false;
        }
        
    }
    

    public String toString() {
        String resultado = "Matricula: " + this.matricula + "kms" + this.kms;
        return resultado;
    }
}