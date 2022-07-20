/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("1ff65c4e-c95f-44b5-ae28-85ee5086756a")
    public static final String STEREOTYPE_NAME = "Data";

    /**
     * Tells whether a {@link Data proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Data >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("de9411b9-3744-4029-9255-b322262f13c2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Data.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Data >> then instantiate a {@link Data} proxy.
     * 
     * @return a {@link Data} proxy on the created {@link Class}.
     */
    @objid ("c5295ec0-e420-4352-ba16-e1f77054f559")
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
    @objid ("5d804f48-02bc-40ab-aad1-4e0013182297")
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
    @objid ("c4dc1147-210a-4bad-a69f-54c670e67904")
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
    @objid ("b2cb5e74-4fe2-4c81-9187-a6fe519ecedb")
    public void addIncludesData(final Data obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("28733b6a-11be-49be-82f9-06ce5244bc72")
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
    @objid ("fcdab3a0-5594-4527-bb0b-3055a8cfffd3")
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
    @objid ("df14e44c-fa71-4858-b6c6-a474f5053135")
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
    @objid ("fd95205d-3c96-43df-83a8-f717f91f93aa")
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
    @objid ("6ca6443f-9ff9-4021-ba77-00fcf6d4b085")
    public Data getParent() {
        return (Data)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), Data.STEREOTYPE_NAME);
    }

    @objid ("5601b1fb-f3a0-4c2a-b2c6-f60bed035707")
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
    @objid ("4d3fde49-cc64-4e33-814e-da35a40e0007")
    public boolean removeIncludesData(final Data obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'dataSource' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7f08dd67-d4de-45e5-970c-5406ce2266bf")
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
    @objid ("582e7c49-8e1b-4fc6-b5f2-bb219f1b7404")
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

    @objid ("1c25724c-c206-43a3-a5ce-e2e385a17c05")
    protected Data(final Class elt) {
        super(elt);
    }

    @objid ("feaa10e5-fc37-4158-ac9e-1c714c329e25")
    public static final class MdaTypes {
        @objid ("77f2d75d-7900-43f9-9db4-732f6ba37728")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dab36744-caaa-49ca-907a-73703380ebb5")
        private static Stereotype MDAASSOCDEP;

        @objid ("6de9d787-0e8a-4f82-81a7-b08a9dd198c2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3d07344b-479d-41e9-9679-bdacb52336e5")
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
