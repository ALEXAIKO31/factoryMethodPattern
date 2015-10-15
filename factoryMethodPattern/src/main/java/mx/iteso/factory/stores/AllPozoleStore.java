package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;

/**
 * Created by is693264 on 08/10/2015.
 */
public class AllPozoleStore extends PozoleStore{
    public String type;

    public AllPozoleStore(){
        this.type="";
    }

    public void setType(String type){
        this.type= type;
    }

    @Override
    protected Pozole createPozole(String meat){
        if(this.type.equals("rojo")){
            PozoleRojoStore pozoleRojoStore= new PozoleRojoStore();
            return pozoleRojoStore.orderPozole(meat);
        }
        else if(this.type.equals("verde")){
            PozoleVerdeStore pozoleVerdeStore= new PozoleVerdeStore();
            return pozoleVerdeStore.orderPozole(meat);
        }
        else if(this.type.equals("blanco")){
            PozoleBlancoStore pozoleBlancoStore= new PozoleBlancoStore();
            return pozoleBlancoStore.orderPozole(meat);
        }
        else if(this.type.equals("pozolillo")){
            PozolilloStore pozolilloStore= new PozolilloStore();
            return pozolilloStore.orderPozole(meat);
        }
        else if(this.type.equals("menudo")){
            MenudoStore menudoStore= new MenudoStore();
            return menudoStore.orderPozole(meat);
        }
        else return null;
    }

}
