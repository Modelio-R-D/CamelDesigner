/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
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
 * Proxy class to handle a {@link Class} with << SoftwareComponentMeasurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("89078e63-2e23-49e3-a485-89531a4dcc4c")
public class SoftwareComponentMeasurement extends Measurement {
<<<<<<< HEAD
    @objid ("de75830d-8d69-488b-837b-254b4acf5b5a")
=======
    @objid ("e8ba337a-fe88-4c39-84d5-c98e4859b045")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "SoftwareComponentMeasurement";

    /**
     * Tells whether a {@link SoftwareComponentMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SoftwareComponentMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("663bc6f2-e49f-46f7-b6a2-006469d65575")
=======
    @objid ("277d3370-0bd4-4a4b-9071-2361748255e2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SoftwareComponentMeasurement >> then instantiate a {@link SoftwareComponentMeasurement} proxy.
     * 
     * @return a {@link SoftwareComponentMeasurement} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("5c7b5926-fb98-4c31-9d63-2b0631aaa600")
=======
    @objid ("257b8422-0d1e-4615-a1f4-ebe8ef804f9c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SoftwareComponentMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SoftwareComponentMeasurement.STEREOTYPE_NAME);
        return SoftwareComponentMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentMeasurement} proxy from a {@link Class} stereotyped << SoftwareComponentMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SoftwareComponentMeasurement} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("bd5ac538-72e9-4e84-b868-abe17c72024f")
=======
    @objid ("8f439879-d474-4470-ae4d-765e3e0ee0be")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SoftwareComponentMeasurement instantiate(final Class obj) {
        return SoftwareComponentMeasurement.canInstantiate(obj) ? new SoftwareComponentMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SoftwareComponentMeasurement} proxy from a {@link Class} stereotyped << SoftwareComponentMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SoftwareComponentMeasurement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("4cafeb0d-2ae5-4a7a-b855-a918353ed86a")
=======
    @objid ("d480836a-9b7f-4d74-9124-7c827cb8580e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SoftwareComponentMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SoftwareComponentMeasurement.canInstantiate(obj))
        	return new SoftwareComponentMeasurement(obj);
        else
        	throw new IllegalArgumentException("SoftwareComponentMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("bb63a68b-df79-4f1e-b590-4d0f2f96592d")
=======
    @objid ("557926ad-4aad-4f03-ab1b-fb581be4393f")
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
        SoftwareComponentMeasurement other = (SoftwareComponentMeasurement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("c248e67a-e039-4e80-82a1-d03e2c5e16bc")
=======
    @objid ("d54ae7ca-49ee-47fe-a476-bca1f61f8fe1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'softwareComponent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("e2ddee47-bfe8-4629-a03b-8f1e58ce19de")
=======
    @objid ("8aea1432-c759-4295-a25f-897590a9ba80")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public SoftwareComponent getSoftwareComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponent")){
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("716f913c-99b2-489e-b568-b04fe4f6e27a")
=======
    @objid ("f3d3011d-fcd6-460f-8bcb-ecc2106d1f20")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public SoftwareComponentInstance getSoftwareComponentInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponentInstance")){
                  if (SoftwareComponentInstance.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponentInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

<<<<<<< HEAD
    @objid ("ae54dc93-05c1-4afa-a592-82cb2abb1652")
=======
    @objid ("95e08674-59b8-40b7-ad61-9f67a685212f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'softwareComponent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("90fe2445-338a-4113-8e0d-bd8859f99fcd")
=======
    @objid ("ffe06934-d5f4-4f83-8e2b-cfd2b051e68d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setSoftwareComponent(final SoftwareComponent obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("softwareComponent");      dep.putTagValue(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'softwareComponentInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("773001aa-ae41-47cf-a0ae-0314c1052b3d")
=======
    @objid ("de82184f-0846-4b31-a1ad-c0e9e5651a82")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setSoftwareComponentInstance(final SoftwareComponentInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "softwareComponentInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("softwareComponentInstance");      dep.putTagValue(SoftwareComponentMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "softwareComponentInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("05ddebc9-9af3-4863-80d6-352f2556deb8")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("1fa14eaa-4fec-40aa-b8fb-b03917af31bb")
=======
    @objid ("d65ee046-25ac-4847-84a2-5dbc74892234")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected SoftwareComponentMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("6678fa3a-6261-42c4-945e-36481919263d")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("80fbf4d4-bab3-449b-ba1e-18c220b4ba82")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("31682087-0dc9-435d-b776-b5fecbe9177c")
        private static Stereotype MDAASSOCDEP;

        @objid ("14cf4b4e-c1d8-498f-aa30-9a2bd191d413")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ece22d64-c88e-42b3-b3df-d2e2f6046a24")
=======
        @objid ("6953b698-ac85-4b9b-9900-a2a301a72b6d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("526bf6b3-9d88-4981-8612-eec9b1fbf047")
        private static Stereotype MDAASSOCDEP;

        @objid ("4b13be67-bf2d-48ae-8294-cc30c723651c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5e0f6972-b6ef-4a82-a839-fc46b69c3560")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cef53d47-e830-42d6-9834-bfc960dc6abe");
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
