/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author u08016696180
 */
public class Kbn_Venda {
    private int kbnIdVenda;
    private int kbnIdCliente;
    private int kbnIdAnimal;
    private Date kbnDataVenda;
    private Double kbnValorTotal;
    private String kbnFormaPagamento;
    private String kbnStatus;

    /**
     * @return the kbnIdVenda
     */
    public int getKbnIdVenda() {
        return kbnIdVenda;
    }

    /**
     * @param kbnIdVenda the kbnIdVenda to set
     */
    public void setKbnIdVenda(int kbnIdVenda) {
        this.kbnIdVenda = kbnIdVenda;
    }

    /**
     * @return the kbnIdCliente
     */
    public int getKbnIdCliente() {
        return kbnIdCliente;
    }

    /**
     * @param kbnIdCliente the kbnIdCliente to set
     */
    public void setKbnIdCliente(int kbnIdCliente) {
        this.kbnIdCliente = kbnIdCliente;
    }

    /**
     * @return the kbnIdAnimal
     */
    public int getKbnIdAnimal() {
        return kbnIdAnimal;
    }

    /**
     * @param kbnIdAnimal the kbnIdAnimal to set
     */
    public void setKbnIdAnimal(int kbnIdAnimal) {
        this.kbnIdAnimal = kbnIdAnimal;
    }

    /**
     * @return the kbnDataVenda
     */
    public Date getKbnDataVenda() {
        return kbnDataVenda;
    }

    /**
     * @param kbnDataVenda the kbnDataVenda to set
     */
    public void setKbnDataVenda(Date kbnDataVenda) {
        this.kbnDataVenda = kbnDataVenda;
    }

    /**
     * @return the kbnValorTotal
     */
    public Double getKbnValorTotal() {
        return kbnValorTotal;
    }

    /**
     * @param kbnValorTotal the kbnValorTotal to set
     */
    public void setKbnValorTotal(Double kbnValorTotal) {
        this.kbnValorTotal = kbnValorTotal;
    }

    /**
     * @return the kbnFormaPagamento
     */
    public String getKbnFormaPagamento() {
        return kbnFormaPagamento;
    }

    /**
     * @param kbnFormaPagamento the kbnFormaPagamento to set
     */
    public void setKbnFormaPagamento(String kbnFormaPagamento) {
        this.kbnFormaPagamento = kbnFormaPagamento;
    }

    /**
     * @return the kbnStatus
     */
    public String getKbnStatus() {
        return kbnStatus;
    }

    /**
     * @param kbnStatus the kbnStatus to set
     */
    public void setKbnStatus(String kbnStatus) {
        this.kbnStatus = kbnStatus;
    }
}
