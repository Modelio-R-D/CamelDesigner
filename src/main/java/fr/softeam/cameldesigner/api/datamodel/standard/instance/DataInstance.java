/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.bindableinstance.DataInstanceBindableInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << DataInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("649011e7-76d7-432b-9ea5-833d04d8e471")
public class DataInstance extends FeatureInstance {
    @objid ("453acffc-73ea-4222-abf2-70d5e8959e67")
    public static final String STEREOTYPE_NAME = "DataInstance";

    /**
     * Tells whether a {@link DataInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << DataInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d5acf953-56dd-4e5c-8def-4442a7352e2f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << DataInstance >> then instantiate a {@link DataInstance} proxy.
     * 
     * @return a {@link DataInstance} proxy on the created {@link Instance}.
     */
    @objid ("473dcc1c-934a-4158-b628-a54ca736df16")
    public static DataInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataInstance.STEREOTYPE_NAME);
        return DataInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link DataInstance} proxy from a {@link Instance} stereotyped << DataInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link DataInstance} proxy or <i>null</i>.
     */
    @objid ("bb75788f-4f81-4bc6-821d-7bee4ccde9fc")
    public static DataInstance instantiate(final Instance obj) {
        return DataInstance.canInstantiate(obj) ? new DataInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataInstance} proxy from a {@link Instance} stereotyped << DataInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link DataInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8a042515-1fa7-48f2-884c-b3c107199f42")
    public static DataInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (DataInstance.canInstantiate(obj))
        	return new DataInstance(obj);
        else
        	throw new IllegalArgumentException("DataInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'includesDataInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fee889b5-98df-4902-87ff-ef690e224103")
    public void addIncludesDataInstance(final DataInstanceBindableInstance obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

    @objid ("0da7ba1d-7fad-4944-a5d5-d658c0d9ab75")
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
        DataInstance other = (DataInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'dataSourceInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8a4f9e42-98c7-47e5-ad93-1d1c99c52f69")
    public DataSourceInstance getDataSourceInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataInstance.MdaTypes.MDAASSOCDEP_ROLE), "dataSourceInstance")){
                  if (DataSourceInstance.canInstantiate(d.getDependsOn()))
                     return (DataSourceInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataSourceInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("1e92d1dd-4dd0-48c3-9b94-bc6045ffed46")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'includesDataInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f1ff52a7-4f44-4263-869c-e59c299cf9dc")
    public List<DataInstanceBindableInstance> getIncludesDataInstance() {
        List<DataInstanceBindableInstance> results = new ArrayList<>();
        for (BindableInstance mObj : ((Instance) this.elt).getPart()){
        	if (DataInstanceBindableInstance.canInstantiate(mObj))
        			results.add((DataInstanceBindableInstance)CamelDesignerProxyFactory.instantiate(mObj, DataInstanceBindableInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c1750484-9935-4260-a227-31180e5a5a51")
    public DataInstanceModel getParent() {
        return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DataInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("be43ccfc-3f92-432b-9139-8c274195f330")
    public Data getType() {
        return (Data)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), Data.STEREOTYPE_NAME);
    }

    @objid ("4cbb9819-0689-4669-a6d9-95de0d211b3b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'includesDataInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("959522cd-41e4-4454-8f91-8db14d245488")
    public boolean removeIncludesDataInstance(final DataInstanceBindableInstance obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'dataSourceInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9bda94db-5976-4293-a40c-23774f2b3f4b")
    public void setDataSourceInstance(final DataSourceInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DataInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataInstance.MdaTypes.MDAASSOCDEP_ROLE), "dataSourceInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DataInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("dataSourceInstance");      dep.putTagValue(DataInstance.MdaTypes.MDAASSOCDEP_ROLE, "dataSourceInstance");
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
    @objid ("93f9a937-bd8a-43fa-ad9e-4f7c0b90e59d")
    public void setParent(final DataInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1940d79d-2fe3-41c5-9beb-3e156658a78d")
    public void setType(final Data obj) {
        ((Instance) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    @objid ("68de0177-b40e-4d1a-ade1-e13a97fb9d7e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("b5d4022a-85b4-4a86-ad71-b44c46f4541a")
    protected DataInstance(final Instance elt) {
        super(elt);
    }

    @objid ("db37a04c-5717-4bc1-9bb0-fe56f193bb91")
    public static final class MdaTypes {
        @objid ("751b0d1d-af97-40f5-a382-83f1f2212797")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dc21b6ae-622a-4f27-9d3f-57d52772070f")
        private static Stereotype MDAASSOCDEP;

        @objid ("8a6f1809-007c-4f48-8348-f3ad09fffb5c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4c2d82bd-33c7-4ff3-9fd2-c4509d54eb58")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fd50c81e-cd4d-4ae8-8e12-a2818c71f1de");
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
