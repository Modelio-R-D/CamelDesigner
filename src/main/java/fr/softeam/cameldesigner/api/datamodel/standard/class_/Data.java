/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("fa0a61e3-de53-44b5-82a1-3d15ed20ceea")
    public static final String STEREOTYPE_NAME = "Data";

    /**
     * Tells whether a {@link Data proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Data >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("85da23ba-5ab7-44fc-b855-41938e571aa7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Data.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Data >> then instantiate a {@link Data} proxy.
     * 
     * @return a {@link Data} proxy on the created {@link Class}.
     */
    @objid ("75371b50-918b-4cc8-ac5e-7600362b1849")
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
    @objid ("242efbaf-d757-4bcd-9654-05756e685387")
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
    @objid ("2ebb936d-38bf-4826-b1f1-b798a58cead3")
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
    @objid ("4a7c5d6d-6115-40bd-b8f0-491946ae6c43")
    public void addIncludesData(final Data obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("a3ab7f22-1f12-49ac-a37c-1e2baa33af77")
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
    @objid ("dc6e7040-51d2-4ff5-9eb0-d14d0952c7dd")
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
    @objid ("6ef17240-6c4a-427d-ba93-3d721bcbd9ba")
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
    @objid ("0ce98233-e700-4e04-8b82-a82e1997d202")
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
    @objid ("9421b7a7-29fb-4750-9fb9-c10e2f02e8ed")
    public Data getParent() {
        return (Data)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), Data.STEREOTYPE_NAME);
    }

    @objid ("1d495023-aef2-4f96-9020-b5301cdce82a")
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
    @objid ("1828e81f-e5db-4ba2-a8c2-6758f3fd084e")
    public boolean removeIncludesData(final Data obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'dataSource' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b9242c6e-391e-45f8-a8b0-ab3ea969a267")
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
    @objid ("1053b6b3-4c03-44e3-97af-703392d4c376")
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

    @objid ("eaab1588-2cf4-41a4-a5de-93ca78a2fe22")
    protected Data(final Class elt) {
        super(elt);
    }

    @objid ("feaa10e5-fc37-4158-ac9e-1c714c329e25")
    public static final class MdaTypes {
        @objid ("22646030-41d7-48e2-9715-165973ac1ba8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("11e82946-52bc-4c34-8e5f-1d0f68ae60ff")
        private static Stereotype MDAASSOCDEP;

        @objid ("5fac630d-e8e6-4c3a-85f2-b5be1f974db3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("376e6e24-1578-4a68-b1a4-fa7ed6ce233e")
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
