package ifpr.pgua.eic.info.banco.Entidades;

public class ContaCorrente extends Conta
{
    private double limite;
    private double taxaManutencao;

    public ContaCorrente(String agencia, String numero, Pessoa cliente, double taxaManutencao, double limite) 
    {
        super(agencia, numero, cliente);
        this.taxaManutencao = taxaManutencao;
        this.limite = limite;
    }
    
    public double getLimite() 
    {
        return limite;
    }

    public void setLimite(double limite)
    {
        this.limite = limite;
    }        

    public double getTaxaManutencao() 
    {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) 
    {
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public String gerarExtrato()
    {
        String texto = "";

        texto = super.gerarExtrato();
        
        texto = texto + " Limite: "+limite;
        texto = texto + " Taxa de manutenção: "+taxaManutencao;

        return texto;
    }
}
