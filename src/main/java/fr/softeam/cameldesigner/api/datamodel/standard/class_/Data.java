/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("61da64ab-8515-4706-8f48-bedf55736d78")
    public static final String STEREOTYPE_NAME = "Data";

    /**
     * Tells whether a {@link Data proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Data >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1956b4f1-3c40-4f1a-827b-952d16020afd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Data.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Data >> then instantiate a {@link Data} proxy.
     * 
     * @return a {@link Data} proxy on the created {@link Class}.
     */
    @objid ("ffbc60a5-9422-491d-b7c4-e731cebad6d5")
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
    @objid ("f27818ea-df43-4afd-900f-8d6c26ccb1bc")
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
    @objid ("23b685db-c7d2-42ea-8849-d3d786654ed2")
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
    @objid ("a3862236-eb3d-4c4e-b53a-3c60700d5ca8")
    public void addIncludesData(final Data obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("65176ce7-1a67-439a-937b-a5927208518e")
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
    @objid ("08737790-5e18-4284-9a5d-096a7e18e7ed")
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
    @objid ("2f175b63-8f29-4e2a-883f-f76a08721e0b")
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
    @objid ("9ea35341-7018-453c-97b6-9fa63f9de294")
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
    @objid ("fa10a0ce-d509-477c-ac8f-010e2a231b51")
    public Data getParent() {
        return (Data)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), Data.STEREOTYPE_NAME);
    }

    @objid ("bc78ccd2-d91d-4c5c-b9a0-75ff466c3a42")
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
    @objid ("f623cd1b-9fbe-4fd8-b052-351d8d419a72")
    public boolean removeIncludesData(final Data obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'dataSource' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("914cdfe7-ee1c-44f2-858e-d672d5ed882f")
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
    @objid ("143e1066-9691-4172-a440-41ab67f114fe")
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

    @objid ("9db7d78d-df0d-4dae-9f1c-3e844035b474")
    protected Data(final Class elt) {
        super(elt);
    }

    @objid ("feaa10e5-fc37-4158-ac9e-1c714c329e25")
    public static final class MdaTypes {
        @objid ("0cea5663-8669-4b37-b5c1-a4008ff94dc3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("83af27fa-cdae-4657-803d-b611611fd662")
        private static Stereotype MDAASSOCDEP;

        @objid ("6b5a36d4-ecd7-4849-abea-388442789322")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4742616f-e55d-4f84-bb67-4d4802092220")
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
