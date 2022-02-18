/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("b67fc9bd-264a-4ca6-9cba-e675fd96fdac")
    public static final String STEREOTYPE_NAME = "DataMeasurement";

    /**
     * Tells whether a {@link DataMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DataMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e639b29f-7c51-45ca-9745-52c4d90bd65b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DataMeasurement >> then instantiate a {@link DataMeasurement} proxy.
     * 
     * @return a {@link DataMeasurement} proxy on the created {@link Class}.
     */
    @objid ("b7605b52-9742-46f9-b584-0380719a605d")
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
    @objid ("695d2ae4-f637-463f-8340-d8b28c292120")
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
    @objid ("232a9bb7-a271-4cc4-a8be-c508195174ed")
    public static DataMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DataMeasurement.canInstantiate(obj))
        	return new DataMeasurement(obj);
        else
        	throw new IllegalArgumentException("DataMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("952db18b-b3d5-49cd-b698-dbde0c756e58")
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
    @objid ("7cf441e7-01e6-49f5-a91d-a5452808b48f")
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
    @objid ("896d4f2b-9151-425f-b0d4-52ce69882aa5")
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
    @objid ("d4ab7387-034f-490e-b82c-56a564b085d0")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("c545b83d-4ca9-4951-8a7c-4f0bcd071505")
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
    @objid ("a4d61a5d-70ec-401c-9205-ee356fd64585")
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
    @objid ("446911de-5d66-4ee6-9b0c-be43404a7082")
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

    @objid ("bc8cbe7b-0174-4542-844c-510077a94498")
    protected DataMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("87143fca-4f6e-494f-b6a8-3dd519ed1fa8")
    public static final class MdaTypes {
        @objid ("3a1fe315-6c89-41fc-80bc-b393fa14a846")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fdbc1e89-7148-455b-b6ba-87b26a18fadd")
        private static Stereotype MDAASSOCDEP;

        @objid ("56556a57-add8-4d93-8734-c86aac198909")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d4edfa7-49b1-40ba-b3f8-88cbd4514a00")
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
