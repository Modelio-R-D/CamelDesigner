/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.06

 * This file was generated on 11/30/20 8:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Data >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class Data extends FeatureClass {
    public static final String STEREOTYPE_NAME = "Data";

    /**
     * Tells whether a {@link Data proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Data >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Data.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Data >> then instantiate a {@link Data} proxy.
     * 
     * @return a {@link Data} proxy on the created {@link Class}.
     */
    public static Data create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Data.STEREOTYPE_NAME);
        return Data.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Data} proxy from a {@link Class} stereotyped << Data >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Data} proxy or <i>null</i>.
     */
    public static Data instantiate(final Class obj) {
        return Data.canInstantiate(obj) ? new Data(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Data} proxy from a {@link Class} stereotyped << Data >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Data} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static Data safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Data.canInstantiate(obj))
        	return new Data(obj);
        else
        	throw new IllegalArgumentException("Data: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Data other = (Data) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'dataSource' role.<p>
     * Role description:
     * null
     * 
     */
    public DataSource getDataSource() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Data.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Data.MdaTypes.MDAASSOCDEP_ROLE), "dataSource")
                  && DataSource.canInstantiate(d.getDependsOn())) {
                     return (DataSource)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataSource.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'dataSource' role.<p>
     * Role description:
     * null
     * 
     */
    public void setDataSource(final DataSource obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Data.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Data.MdaTypes.MDAASSOCDEP_ROLE), "dataSource")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Data.MdaTypes.MDAASSOCDEP);
              dep.setName("dataSource");      dep.putTagValue(Data.MdaTypes.MDAASSOCDEP_ROLE, "dataSource");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    protected Data(final Class elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe12d8bd-3047-4893-8e67-549a85ecb744");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
