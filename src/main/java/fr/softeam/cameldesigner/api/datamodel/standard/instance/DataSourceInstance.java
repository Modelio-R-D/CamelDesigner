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
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << DataSourceInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7596aa7f-0bb2-4518-8c82-6822a15475d0")
public class DataSourceInstance extends FeatureInstance {
<<<<<<< HEAD
    @objid ("7fd1ef42-37b1-441f-96fe-7d733c931368")
=======
    @objid ("14b66e78-b234-44dc-b073-a1548a56c31c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "DataSourceInstance";

    /**
     * Tells whether a {@link DataSourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << DataSourceInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("6d1e6095-6589-41fe-8562-768950ca0767")
=======
    @objid ("02147b15-095b-4527-b605-31f85163e024")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataSourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << DataSourceInstance >> then instantiate a {@link DataSourceInstance} proxy.
     * 
     * @return a {@link DataSourceInstance} proxy on the created {@link Instance}.
     */
<<<<<<< HEAD
    @objid ("04f036c6-d240-4881-a348-8a0b0bc8295d")
=======
    @objid ("8c514a68-ed72-4452-845b-5c6b09924207")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DataSourceInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataSourceInstance.STEREOTYPE_NAME);
        return DataSourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link DataSourceInstance} proxy from a {@link Instance} stereotyped << DataSourceInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link DataSourceInstance} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("8226a6c6-023c-4d64-a63f-3a4d4b75b7a6")
=======
    @objid ("821770c1-f7f9-489d-a360-1e346b536afb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DataSourceInstance instantiate(final Instance obj) {
        return DataSourceInstance.canInstantiate(obj) ? new DataSourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataSourceInstance} proxy from a {@link Instance} stereotyped << DataSourceInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link DataSourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("d44457d8-1590-405f-b4b6-0efff202c2d8")
=======
    @objid ("9ddfc7d8-5c42-49c8-bd70-fc7d5c434619")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static DataSourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (DataSourceInstance.canInstantiate(obj))
        	return new DataSourceInstance(obj);
        else
        	throw new IllegalArgumentException("DataSourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("3f8c8182-61be-41fd-a360-f396eab6bdf2")
=======
    @objid ("e92ed6bc-e90c-48cb-8407-b51b273ec258")
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
        DataSourceInstance other = (DataSourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("58dbe2d2-af15-449c-bbaf-54e35e7c123d")
=======
    @objid ("d7970096-b74f-44ca-9ccd-0c757009ddc9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("27916dce-1366-42ee-aabd-170540c52257")
=======
    @objid ("305a634f-88b1-46cf-b9a8-0afdff4eea33")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public DataInstanceModel getParent() {
        return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getOwner(), DataInstanceModel.STEREOTYPE_NAME);
    }

    /**
     * Get the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("6b41ee78-c2a2-40a6-9162-eacfea47ec7d")
=======
    @objid ("2ab3a7a0-a4e4-448d-b5f3-baf83237b9e8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public SoftwareComponentInstance getSoftwareComponentInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataSourceInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataSourceInstance.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponentInstance")){
                  if (SoftwareComponentInstance.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponentInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("4e970449-e9a1-4436-99bc-a26a21e1f68b")
=======
    @objid ("8eb1b73a-758a-42ca-9207-a246108b12b3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public DataSource getType() {
        return (DataSource)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), DataSource.STEREOTYPE_NAME);
    }

<<<<<<< HEAD
    @objid ("6dff8f00-6eb4-4e88-b2cc-436d274fd91f")
=======
    @objid ("57f943b8-dfcb-44aa-8e73-50e02f870314")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a4c49bd4-05fa-49de-9bd2-217458388051")
=======
    @objid ("9a0df71c-4e26-44eb-8e78-3f90818f121c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setParent(final DataInstanceModel obj) {
        ((Instance) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f4b76744-5afb-448a-81e4-7c5b9c3eab77")
=======
    @objid ("56062cc9-3a55-4597-9215-eb6ec9973337")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setSoftwareComponentInstance(final SoftwareComponentInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DataSourceInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataSourceInstance.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponentInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DataSourceInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("softwareComponentInstance");      dep.putTagValue(DataSourceInstance.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponentInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b8078197-27dd-4e03-82a1-97c7cc35ab82")
=======
    @objid ("ea296958-824e-432c-95f4-479f3bcdfdf1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setType(final DataSource obj) {
        ((Instance) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    @objid ("bb97ce67-1add-4095-86f2-6ed1c2d1641b")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("a7f6a9da-5634-4a81-97d5-8a5ba912d5c2")
=======
    @objid ("be8662dd-ef68-42ae-863b-d50afa063e3e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DataSourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("f274074b-7683-49b4-b45f-098faac6eaa7")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("55592f0d-90f5-4a4e-b375-07daff236cdd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9d7726f5-e6ac-4bf5-a899-2b1d7722a03d")
        private static Stereotype MDAASSOCDEP;

        @objid ("9c8f4c83-61c0-48db-978b-ce9eb66fba17")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d579531a-992d-49ed-beea-9a8cd6d0c6e6")
=======
        @objid ("cae39efe-a23a-478c-95df-0c768c98abdd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4d47d5db-731b-4a79-b03e-3dc581791f4a")
        private static Stereotype MDAASSOCDEP;

        @objid ("99a0a581-16e1-44de-a14e-431fbd616ddc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fb7e3c29-6902-4a5c-b803-884d121ee451")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b72705cc-1db6-46cb-8f6e-de0c711a1997");
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
