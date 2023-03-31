package br.com.atacado.dominio;

import java.time.LocalDate;

public class Veiculo extends BaseTransporte {

    private int placa;
    private int codigoFrota;
    
    
    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getCodigoFrota() {
        return codigoFrota;
    }

    public void setCodigoFrota(int codigoFrota) {
        this.codigoFrota = codigoFrota;
    }

    public Veiculo(int codigo, String descricao, LocalDate dataInsert, int placa, int codigoFrota) {
        super(codigo, descricao, dataInsert);
        this.placa = placa;
        this.codigoFrota = codigoFrota;
    }
    
    
}
