package manager;

import control.Plataforma;
import user.Cliente;
import user.Membro;

import java.util.Date;

public class AreaTrabalho {

    public int id;
    public String quadro;
    public int quantidade;
    public String descritivo;
    public Date calendario;
    public int tamanhoFonte;
    public Cliente base;
    public Membro perfil;
    public boolean desbloqueado;

    public AreaTrabalho(int id, String quadro, int quantidade, String descritivo, Date calendario, int tamanhoFonte, Cliente base, Membro perfil, boolean desbloqueado) {
        this.id = id;
        this.quadro = quadro;
        this.quantidade = quantidade;
        this.descritivo = descritivo;
        this.calendario = calendario;
        this.tamanhoFonte = 12;
        this.base = base;
        this.perfil = perfil;
        this.desbloqueado = desbloqueado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuadro() {
        return quadro;
    }

    public void setQuadro(String quadro) {
        this.quadro = quadro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public Date getCalendario() {
        return calendario;
    }

    public void setCalendario(Date calendario) {
        this.calendario = calendario;
    }

    public int getTamanhoFonte() {
        return tamanhoFonte;
    }

    public void setTamanhoFonte(int tamanhoFonte) {
        this.tamanhoFonte = tamanhoFonte;
    }

    public Cliente getBase() {
        return base;
    }

    public void setBase(Cliente base) {
        this.base = base;
    }

    public Membro getPerfil() {
        return perfil;
    }

    public void setPerfil(Membro perfil) {
        this.perfil = perfil;
    }

    public boolean isDesbloqueado() {
        return desbloqueado;
    }

    public void setDesbloqueado(boolean desbloqueado) {
        this.desbloqueado = desbloqueado;
    }

    public boolean permissaoNovasAreas(Plataforma plataforma) {
        if (plataforma.plano == "NEWBIE") {
            this.quantidade = 1;
            return false;
        } else {
            this.quantidade = 3;
            return true;
        }
    }
}
