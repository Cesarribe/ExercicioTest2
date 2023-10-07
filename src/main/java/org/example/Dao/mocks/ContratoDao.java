package org.example.Dao.mocks;


import org.example.Dao.IContratoDao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {

        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }
    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }
    @Override
    public void alterar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }
}