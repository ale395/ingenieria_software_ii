package pkg_entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pkg_entidad.Usuario;
import pkg_entidad.Vacuna;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-11-04T15:30:31")
@StaticMetamodel(Hijo.class)
public class Hijo_ { 

    public static volatile CollectionAttribute<Hijo, Vacuna> vacunaCollection;
    public static volatile SingularAttribute<Hijo, Integer> id;
    public static volatile SingularAttribute<Hijo, String> sexo;
    public static volatile SingularAttribute<Hijo, Usuario> idPadre;
    public static volatile SingularAttribute<Hijo, Integer> edad;
    public static volatile SingularAttribute<Hijo, String> nombre;

}