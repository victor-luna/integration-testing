package control;

import manager.AreaTrabalho;
import user.Membro;

public class Plataforma {

    public String nomeDaPlataforma;
    public String plano;
    public String idioma;
    public String status;
    public boolean darkMode;
    public boolean online;

    public Plataforma(String nomeDaPlataforma, String plano, String idioma, String status, boolean darkMode, boolean online) {
        this.nomeDaPlataforma = nomeDaPlataforma;
        this.plano = plano;
        this.idioma = idioma;
        this.status = status;
        this.darkMode = darkMode;
        this.online = online;
    }

    public String getNomeDaPlataforma() {
        return nomeDaPlataforma;
    }

    public void setNomeDaPlataforma(String nomeDaPlataforma) {
        this.nomeDaPlataforma = nomeDaPlataforma;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String verificaPlano(Membro membro) {
        if (membro.getUsuario().contains("@newbie")) {
            this.plano = "NEWBIE";
            return "Plano inicial";
        } else {
            this.plano = "PRO";
            return "Plano premium";
        }
    }

    public boolean bloquearArea(AreaTrabalho areaTrabalho, Membro membro) {
        if (verificaPlano(membro) == "Plano inicial") {
            this.status = "NORMALIZADO - SEM ÁREA DE TRABALHO BLOQUEADA";
            System.out.println("ERRO: Seu plano não permite o bloqueio de área de trabalho.");
            return false;
        } else if (areaTrabalho.desbloqueado == false) {
            this.status = "RESTRITO - COM ÁREA DE TRABALHO BLOQUEADA";
            System.out.println("ERRO: Sua área de trabalho já está bloqueada.");
            return false;
        } else {
            System.out.println("OK: Proceder com o bloqueio de área de trabalho...");
            this.status = "RESTRITO - INICIANDO BLOQUEIO DE ÁREA DE TRABALHO";
            areaTrabalho.desbloqueado = false;
            return true;
        }
    }

    public boolean fonteSizePermitida(Membro membro, AreaTrabalho areaTrabalho) {
        if (membro.isAdmin() == true) {
            if (areaTrabalho.getTamanhoFonte() >= 12 && areaTrabalho.getTamanhoFonte() <= 22) {
                System.out.println("Tamanho de fonte permitida!");
                int novoTamanho = areaTrabalho.getTamanhoFonte();
                areaTrabalho.setTamanhoFonte(novoTamanho);
                return true;
            } else {
                System.out.println("Tamanho de fonte NÃO permitida! Escolha outro número.");
                return false;
            }
        } else {
            System.out.println("ERRO: Você não é administrador!");
            return false;
        }
    }


    public String criarAreaTrabalhoExtra(Membro membro, AreaTrabalho areaTrabalho) {
        if (membro.getUsuario().contains("@pro") && areaTrabalho.getQuantidade() >= 1) {
            this.nomeDaPlataforma = "PRO___";
            int qtd = areaTrabalho.getQuantidade();
            areaTrabalho.setQuantidade(qtd + 1);
            return "É possível criar uma nova área de trabalho. Prosseguir!";
        } else if (membro.getUsuario().contains("@newbie")) {
            this.nomeDaPlataforma = "NEWBIE___";
            return "ERRO: Não é possível criar uma nova área de trabalho. Seu plano não permite!";
        } else {
            this.nomeDaPlataforma = "PRO___";
            return "ERRO: Você ainda não tem uma área de trabalho inicial!";
        }
    }

    public boolean concederAcesso(Membro membro, AreaTrabalho areatrabalho) {
        if(membro.isAdmin() && areatrabalho.isDesbloqueado()) {
            this.status = "Liberado";
            System.out.println("Acesso concedido.");
            return true;
        } else {
            System.out.println("ERRO: Area de trabalho está bloqueada ou você não possui status de administrador.");
            return false;
        }
    }
}
