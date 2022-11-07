package user;

public class Membro {

    public String usuario;
    private String senha;
    public String email;
    public String descricao;
    public boolean acessoLiberado;
    public boolean admin;

    public Membro(String usuario, String senha, String email, String descricao, boolean acessoLiberado, boolean admin) {
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.descricao = descricao;
        this.acessoLiberado = acessoLiberado;
        this.admin = admin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAcessoLiberado() {
        return acessoLiberado;
    }

    public void setAcessoLiberado(boolean acessoLiberado) {
        this.acessoLiberado = acessoLiberado;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }


}
