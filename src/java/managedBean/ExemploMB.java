package managedBean;

import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import model.entity.Pessoa;

@Named(value = "exemploMB")
@RequestScoped
public class ExemploMB {

    private ArrayList<Pessoa> listaPessoas;
    
    public ExemploMB() {
        listaPessoas = new ArrayList<>();
        
        Pessoa p;
        
        for(int i = 0; i < 10; i++)
        {
            p = new Pessoa();
            p.setNome("Nome " + i);
            p.setSobrenome("Sobrenome " + i);

            listaPessoas.add(p);
        }
    }
    
    public ArrayList<Pessoa> getListaPessoas()
    {
        return listaPessoas;
    }
    
}
