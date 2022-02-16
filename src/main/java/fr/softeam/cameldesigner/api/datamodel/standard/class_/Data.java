/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
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
@objid ("d6e20c69-fb86-4fa7-8543-54421e74bd48")
public class Data extends FeatureClass {
    @objid ("99b856c0-0751-41bd-ae70-a661bc1b6ee7")
    public static final String STEREOTYPE_NAME = "Data";

    /**
     * Tells whether a {@link Data proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Data >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("14c28cf2-b3ab-42db-90be-4fd4eabd8f7f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Data.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Data >> then instantiate a {@link Data} proxy.
     * 
     * @return a {@link Data} proxy on the created {@link Class}.
     */
    @objid ("3d8613c9-ed70-4a15-be93-2731bd85f27e")
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
    @objid ("e8d34a76-4d9d-40c4-b096-72c062c21eae")
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
    @objid ("aba8bf27-b328-4939-a70e-a15cc2aeeffa")
    public static Data safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Data.canInstantiate(obj))
        	return new Data(obj);
        else
        	throw new IllegalArgumentException("Data: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'includesData' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b5bada10-869b-4ba3-902e-d55cc2b418ea")
    public void addIncludesData(final Data obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("c9fd8bd4-f0c4-43be-9350-e1b44a06ab6f")
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
    @objid ("c6708228-14ea-4818-be3f-6082172840a3")
    public DataSource getDataSource() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Data.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Data.MdaTypes.MDAASSOCDEP_ROLE), "dataSource")){
                  if (DataSource.canInstantiate(d.getDependsOn()))
                     return (DataSource)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataSource.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8e128bd3-de02-4720-a680-e6e3b7119701")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'includesData' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("25f35310-4658-482b-9738-b07126937149")
    public List<Data> getIncludesData() {
        List<Data> results = new ArrayList<>();
        for (ModelTree mObj : ((Class) this.elt).getOwnedElement()){
        	if (Data.canInstantiate(mObj))
        			results.add((Data)CamelDesignerProxyFactory.instantiate(mObj, Data.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f92d0243-01f9-443f-b6e5-5a8924eebc0e")
    public Data getParent() {
        return (Data)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), Data.STEREOTYPE_NAME);
    }

    @objid ("1b4c860b-c0f8-4633-a5f0-5de7510eaecb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'includesData' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b9440262-50a1-422d-a61b-79842110dfb8")
    public boolean removeIncludesData(final Data obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'dataSource' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a00dc3f3-8e32-4318-ae9d-174aac509bd1")
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

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("457b80e0-5e77-454e-967f-82745864fa1f")
    public void setParent(final Data obj) {
        ((Class) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("4dc038ac-6b89-4be8-aedc-b1eacd133a58")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("93a6827e-6e12-4449-b1b6-7ec081b71756")
    protected Data(final Class elt) {
        super(elt);
    }

    @objid ("feaa10e5-fc37-4158-ac9e-1c714c329e25")
    public static final class MdaTypes {
        @objid ("50b476c6-f454-4544-859d-592297f62a0a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("35ca05fc-6229-42d7-889a-1b4097b5821e")
        private static Stereotype MDAASSOCDEP;

        @objid ("a7fbd5fa-7963-4802-b6e3-d7adb6b943ab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7e07ec5e-9937-42c8-b1a8-2648074326a6")
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
