/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.datamodel.standard.bindableinstance.DataInstanceBindableInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
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
 * Proxy class to handle a {@link Class} with << DataMeasurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("14a8b56f-d785-464c-a539-c3deadd856a3")
public class DataMeasurement extends Measurement {
    @objid ("df91f9d8-eee8-4835-b4a2-5a0bc0f7cf22")
    public static final String STEREOTYPE_NAME = "DataMeasurement";

    /**
     * Tells whether a {@link DataMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d3ac3cb6-74b2-4f47-8506-52daac366a15")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataMeasurement >> then instantiate a {@link DataMeasurement} proxy.
     * 
     * @return a {@link DataMeasurement} proxy on the created {@link Class}.
     */
    @objid ("e4687f67-dc96-4d1f-a4a0-4c0b54f0c1c3")
    public static DataMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataMeasurement.STEREOTYPE_NAME);
        return DataMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link DataMeasurement} proxy from a {@link Class} stereotyped << DataMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link DataMeasurement} proxy or <i>null</i>.
     */
    @objid ("48efb153-0f17-4411-ac10-87ae30f2197c")
    public static DataMeasurement instantiate(final Class obj) {
        return DataMeasurement.canInstantiate(obj) ? new DataMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataMeasurement} proxy from a {@link Class} stereotyped << DataMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link DataMeasurement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f415dfeb-1b20-4392-9c10-af7d9f0718a8")
    public static DataMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DataMeasurement.canInstantiate(obj))
        	return new DataMeasurement(obj);
        else
        	throw new IllegalArgumentException("DataMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e1c53ac6-b188-4058-8162-73aa0a055f89")
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
        DataMeasurement other = (DataMeasurement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'data' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4068cca9-7331-468e-aad4-9a21f16fdba5")
    public Data getData() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "data")){
                  if (Data.canInstantiate(d.getDependsOn()))
                     return (Data)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Data.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'dataInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ecbfcc6c-8d06-4006-990e-6f24c21548b6")
    public DataInstance getDataInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DataMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DataMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "dataInstance")){
                  if (DataInstanceBindableInstance.canInstantiate(d.getDependsOn()))
                     return (DataInstanceBindableInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstanceBindableInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DataInstance.canInstantiate(d.getDependsOn()))
                     return (DataInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("50c5239f-5d6a-4582-838f-458af7849655")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("881c6d99-dc92-4529-9c70-8b197df86119")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'data' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("720ba585-ad7a-4ef6-b67e-eab3cf1081f5")
    public void setData(final Data obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DataMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "data")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DataMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("data");      dep.putTagValue(DataMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "data");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'dataInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("818bba75-d122-4730-b814-3f9e5c034fb2")
    public void setDataInstance(final DataInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DataMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DataMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "dataInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DataMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("dataInstance");      dep.putTagValue(DataMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "dataInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("b002f5a2-538b-4f97-8b5b-267bd55f6154")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("af74759c-35cf-477f-94c0-9f6cc35f31ff")
    protected DataMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("87143fca-4f6e-494f-b6a8-3dd519ed1fa8")
    public static final class MdaTypes {
        @objid ("8dc7233c-7646-4c38-b4a0-c1ccd542cfb5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("07d9c023-270f-4294-9288-c05b520e0725")
        private static Stereotype MDAASSOCDEP;

        @objid ("7453d9ea-a4a1-45a8-8e10-cd33f9135780")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b437b95b-8b2c-4dfd-8b66-34232244eadf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe1fd247-1047-4137-8ff6-90ed2e79ac91");
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
