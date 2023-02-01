/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0727e194-3f5c-4b2f-8778-65cc8ca0aca1")
=======
    @objid ("6811dcae-126d-47ce-bae1-3f8d36254965")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "DataInstance";

    /**
     * Tells whether a {@link DataInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << DataInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("54005960-8aec-49fa-b944-717980940adf")
=======
    @objid ("ce001c08-188f-48d5-a3e1-644d72036747")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << DataInstance >> then instantiate a {@link DataInstance} proxy.
     * 
     * @return a {@link DataInstance} proxy on the created {@link Instance}.
     */
<<<<<<< HEAD
    @objid ("e0b2c7e8-60fb-43ea-89f1-e26dfa0992b8")
=======
    @objid ("a752a131-66b9-42d3-b7d3-c205ba621dbf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("79ef7a0c-d822-4382-aa8d-c4e71ca34383")
=======
    @objid ("639f0433-77c7-468e-b5ba-a6500fd4b498")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("378e7132-e73d-425d-bfa7-af53f1d67dda")
=======
    @objid ("c4f0ec6b-e9e5-4ac4-b7b8-1109b7de14e7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5f69bf50-0bfe-47f5-970e-f234caf49e88")
=======
    @objid ("ccb6755b-f493-4c6c-a6c0-3db2171553ec")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addIncludesDataInstance(final DataInstanceBindableInstance obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("f53a892a-5eb6-4a11-957b-96bbe09e2b3d")
=======
    @objid ("b77f7b99-a961-4f60-8505-2d0192b46f96")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0e4de11d-a896-4516-83c4-df96c9a844a4")
=======
    @objid ("defa8e09-3afb-4da3-802f-3a9eaabc11c5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3e954b13-12b5-4939-9bf5-db5cf388c539")
=======
    @objid ("ca5b3f67-ee5c-45a5-879a-3cbe3c200689")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("085c4bcd-1bff-403a-9d89-f8ef123d1b95")
=======
    @objid ("f747e6bc-a722-4ae1-9f99-fc3c5db99343")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("588040f5-da2c-40fe-8e57-8a7b057385ad")
=======
    @objid ("64cb52be-2bd5-45e2-9d14-fd78cc8b2f00")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public DataInstanceModel getParent() {
        return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DataInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("8d715c2b-e872-4ead-8217-3729ce496b80")
=======
    @objid ("ba34f0b6-4858-476e-821a-dc501655fa3d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public Data getType() {
        return (Data)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), Data.STEREOTYPE_NAME);
    }

<<<<<<< HEAD
    @objid ("44d5676e-f296-44df-abc3-2b7f48375da8")
=======
    @objid ("72bc6935-e2ed-4c00-b616-82f3fa1ed715")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e831fe6f-0e9e-4a99-a1d5-da5345641ca7")
=======
    @objid ("b4cdfd29-072b-4666-83ad-2de1a93c27f0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeIncludesDataInstance(final DataInstanceBindableInstance obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'dataSourceInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("e516cc35-f21a-4a92-a29a-bd6cc8146389")
=======
    @objid ("bd6d1a6d-6fbc-4508-b588-131c75bcec86")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3ec170f4-f5c9-4c44-88aa-d1bd0873794d")
=======
    @objid ("9ac3c281-9ffc-45c2-a1fc-dbc205f4bff4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setParent(final DataInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("12132d26-6579-4d51-b66d-a45a5fb896c8")
=======
    @objid ("a8296729-1b08-49f0-9b6d-c197fe876298")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("fdebe84f-3c35-4e35-b553-ac5023a60c6a")
=======
    @objid ("7cf3c60c-2d3c-4f26-8d2b-c251b52cb69e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DataInstance(final Instance elt) {
        super(elt);
    }

    @objid ("db37a04c-5717-4bc1-9bb0-fe56f193bb91")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("c3d9aaa6-6816-45cb-ac7b-85990f3b4402")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("552180ed-6614-41a6-80f7-01352f77f8e8")
        private static Stereotype MDAASSOCDEP;

        @objid ("708b56da-51a1-4164-bea1-13bbae2316e1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("da49f6b3-e26e-46df-9049-c696096db8ff")
=======
        @objid ("1d1f8549-2f09-418d-8c35-39cc326b20a3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c7e6f7c9-6ce4-4a42-afa2-6df15a6a3283")
        private static Stereotype MDAASSOCDEP;

        @objid ("2b8bd3b8-e258-475d-8e63-9bc985474dbd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ac9bf42e-4a1f-488a-871c-2a1ba7841063")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
