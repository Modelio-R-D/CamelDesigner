/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("91724dd9-bdab-4ef9-8271-852ad7212985")
    public static final String STEREOTYPE_NAME = "DataMeasurement";

    /**
     * Tells whether a {@link DataMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("46f00f65-0185-47fa-8e21-1e85d4dd4694")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataMeasurement >> then instantiate a {@link DataMeasurement} proxy.
     * 
     * @return a {@link DataMeasurement} proxy on the created {@link Class}.
     */
    @objid ("1a8410d4-3dc3-4a50-b56d-c38622090f63")
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
    @objid ("6a4ca5d7-12ee-4f24-8772-a61638a104bc")
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
    @objid ("285e1eec-ddfe-4901-8fd0-81ae8bb57da1")
    public static DataMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DataMeasurement.canInstantiate(obj))
        	return new DataMeasurement(obj);
        else
        	throw new IllegalArgumentException("DataMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ef8a0c4a-e1f5-4618-b405-98ad2b99d64b")
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
    @objid ("ff321450-43ec-4ff9-aa24-be738e92e3da")
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
    @objid ("45bee600-7c4e-40f0-8987-0fea02fd5eee")
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
    @objid ("58dff189-ae22-48a6-8b69-58b8d6216bfd")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("bb7f74bb-0f7f-4eb0-bd26-8aa88e56c467")
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
    @objid ("08d01807-4a9c-4fcb-b651-25e12a6dbd25")
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
    @objid ("37d11eb4-ec43-403d-9b61-da3b7493d0ea")
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

    @objid ("76de1685-79f2-487a-b358-0d30c06b72ce")
    protected DataMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("87143fca-4f6e-494f-b6a8-3dd519ed1fa8")
    public static final class MdaTypes {
        @objid ("2f6331ab-30f2-4aae-b5e8-296b2cfa358c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b2426bf6-8a8a-4bb6-b889-8273859b300b")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb0aef09-3a80-4841-bbdb-2dcd24213ec3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b8e83513-296b-4346-ba32-cda5c15bfa76")
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
