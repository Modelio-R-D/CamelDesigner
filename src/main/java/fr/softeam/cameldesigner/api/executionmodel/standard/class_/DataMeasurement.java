/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("d12c3716-aae5-4879-aaad-58a7ff58558d")
    public static final String STEREOTYPE_NAME = "DataMeasurement";

    /**
     * Tells whether a {@link DataMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3d547c5c-ed0b-4ec9-9922-0f8f40483bcd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataMeasurement >> then instantiate a {@link DataMeasurement} proxy.
     * 
     * @return a {@link DataMeasurement} proxy on the created {@link Class}.
     */
    @objid ("cf204e6e-f118-4b27-82e3-8283c482748b")
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
    @objid ("825dca5f-0138-4aa3-98ce-69125a235084")
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
    @objid ("10c3b527-eea3-4323-adb7-35307c551479")
    public static DataMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DataMeasurement.canInstantiate(obj))
        	return new DataMeasurement(obj);
        else
        	throw new IllegalArgumentException("DataMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d779cc5a-c6a6-49dc-ac0e-a12b9ecd5948")
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
    @objid ("97f6f62b-e4f6-4c2e-abd1-1bd63b73fa1f")
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
    @objid ("3876f207-8604-475d-9efe-53ae1f4ea878")
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
    @objid ("3b6d5981-7821-43d6-81af-73c32d33849e")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("7f2230ee-9013-49b2-b627-401349fe9c28")
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
    @objid ("919ea847-cc38-4a9b-9e3d-9c856736b368")
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
    @objid ("455def71-b339-4ff9-a54c-5c92710ac422")
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

    @objid ("9d9fd4ee-3ac7-41be-8b8a-ebd356eb1b13")
    protected DataMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("87143fca-4f6e-494f-b6a8-3dd519ed1fa8")
    public static final class MdaTypes {
        @objid ("1d18389b-df98-44cf-bd97-823a419dad2a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("11791d86-7b3c-4cc5-8119-934f42a28a1c")
        private static Stereotype MDAASSOCDEP;

        @objid ("2842c778-553a-4949-b34b-176371a72bdc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a4d45249-234f-4628-b8db-a49c01c09989")
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
