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
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO;
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
 * Proxy class to handle a {@link Class} with << SLOViolation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("229f0919-35a3-4332-a078-24ebef396ceb")
public class SLOViolation extends Cause {
<<<<<<< HEAD
    @objid ("2d802650-7f86-49f4-abd9-5af82eb9dd72")
    public static final String STEREOTYPE_NAME = "SLOViolation";

    @objid ("cdb21c2a-ad38-4104-a890-f71347d9fd37")
=======
    @objid ("082a037e-9f43-4d4f-8fc1-0900b4289bd1")
    public static final String STEREOTYPE_NAME = "SLOViolation";

    @objid ("c4358154-3cfe-433e-8507-cd9e10b123f4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String ASSESSMENTTIME_TAGTYPE = "assessmentTime";

    /**
     * Tells whether a {@link SLOViolation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SLOViolation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("18960137-820b-420b-8432-25986909fd4b")
=======
    @objid ("e4bdd7a1-3906-4b08-9f51-903773c680f4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SLOViolation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SLOViolation >> then instantiate a {@link SLOViolation} proxy.
     * 
     * @return a {@link SLOViolation} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("a9375ae1-6044-4a9b-9186-1345d0c2913a")
=======
    @objid ("209ed17a-d6e7-48a8-b531-e740352c2519")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SLOViolation create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SLOViolation.STEREOTYPE_NAME);
        return SLOViolation.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SLOViolation} proxy from a {@link Class} stereotyped << SLOViolation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SLOViolation} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("03c2c586-5ac5-4e8a-a88b-d23468b6f017")
=======
    @objid ("2af7217d-3567-48e0-b427-50da95976394")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SLOViolation instantiate(final Class obj) {
        return SLOViolation.canInstantiate(obj) ? new SLOViolation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SLOViolation} proxy from a {@link Class} stereotyped << SLOViolation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SLOViolation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("bd8cf796-75ca-4f35-b84f-133ad08b08b6")
=======
    @objid ("f41ac958-3d40-484f-98d3-18c71dfb4f7f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SLOViolation safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SLOViolation.canInstantiate(obj))
        	return new SLOViolation(obj);
        else
        	throw new IllegalArgumentException("SLOViolation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("715b9bda-e60a-47e8-ae97-1fbab54602b4")
=======
    @objid ("6b15490c-7059-427d-8f6f-0afbe28e543f")
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
        SLOViolation other = (SLOViolation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'assessmentTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("52e5c278-c6a2-4ba4-bec9-065f2fa331d2")
=======
    @objid ("b5e360d6-ed75-4eb6-a2b9-815ee61cb05b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getAssessmentTime() {
        return this.elt.getTagValue(SLOViolation.MdaTypes.ASSESSMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("4896c8d4-38cc-437d-8e2a-7fdb1a141f2f")
=======
    @objid ("4ecb7b7b-2397-4258-8b6c-7e1821d7d3f6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'measurement' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a5c0eaf5-9885-4b7c-93a8-8556536f995d")
=======
    @objid ("39684515-a475-4be5-bc0a-b6695fc6ab71")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public Measurement getMeasurement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SLOViolation.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SLOViolation.MdaTypes.MDAASSOCDEP_ROLE), "measurement")){
                  if (ApplicationMeasurement.canInstantiate(d.getDependsOn()))
                     return (ApplicationMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ApplicationMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CommunicationMeasurement.canInstantiate(d.getDependsOn()))
                     return (CommunicationMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ContainerMeasurement.canInstantiate(d.getDependsOn()))
                     return (ContainerMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ContainerMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DataMeasurement.canInstantiate(d.getDependsOn()))
                     return (DataMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PaaSMeasurement.canInstantiate(d.getDependsOn()))
                     return (PaaSMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponentMeasurement.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponentMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (VMMeasurement.canInstantiate(d.getDependsOn()))
                     return (VMMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VMMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'slo' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("7b3949dd-ad9f-4bf3-a3c1-4b5345b077b9")
=======
    @objid ("0cb33f23-1876-4fb2-a673-ea4ab74b6fef")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public ServiceLevelObjective getSlo() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SLOViolation.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SLOViolation.MdaTypes.MDAASSOCDEP_ROLE), "slo")){
                  if (SecuritySLO.canInstantiate(d.getDependsOn()))
                     return (SecuritySLO)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecuritySLO.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ServiceLevelObjective.canInstantiate(d.getDependsOn()))
                     return (ServiceLevelObjective)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ServiceLevelObjective.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

<<<<<<< HEAD
    @objid ("06b7e79d-d249-4295-9cdb-2927537cce70")
=======
    @objid ("54711a35-018f-4922-8b7c-1c2e5a7e46d4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'assessmentTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("861586c8-e383-4f72-870c-42d880bbbb01")
=======
    @objid ("0638f8a9-7a84-4377-ad16-0a2a67c8a096")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setAssessmentTime(final String value) {
        this.elt.putTagValue(SLOViolation.MdaTypes.ASSESSMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'measurement' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("eb7c9485-af76-4b8d-bdaa-099bbfad4550")
=======
    @objid ("539226a6-efee-466b-bcca-b428ef4abcbf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setMeasurement(final Measurement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SLOViolation.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SLOViolation.MdaTypes.MDAASSOCDEP_ROLE), "measurement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SLOViolation.MdaTypes.MDAASSOCDEP);
              dep.setName("measurement");      dep.putTagValue(SLOViolation.MdaTypes.MDAASSOCDEP_ROLE, "measurement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'slo' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a475e32b-b323-485d-ba89-7736d8240b49")
=======
    @objid ("642af6d6-5aba-493b-80dd-ff838a2f8c81")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setSlo(final ServiceLevelObjective obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SLOViolation.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SLOViolation.MdaTypes.MDAASSOCDEP_ROLE), "slo")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SLOViolation.MdaTypes.MDAASSOCDEP);
              dep.setName("slo");      dep.putTagValue(SLOViolation.MdaTypes.MDAASSOCDEP_ROLE, "slo");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("c5706353-340d-48e7-8d78-54dc0a893188")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("04b4a1c3-d120-4609-b5c3-e686918e2b00")
=======
    @objid ("f92ac887-2f79-4a96-a636-657e45c687ce")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected SLOViolation(final Class elt) {
        super(elt);
    }

    @objid ("d2af686a-83ed-4904-8eb0-ef64e85d5728")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("2fb99ff1-35ab-4c1f-84c8-9bba81976aaa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("03eac023-41ac-47cb-a5fe-4d20d3550383")
        public static TagType ASSESSMENTTIME_TAGTYPE_ELT;

        @objid ("41c8592e-7bb2-476b-b423-1bbe7d077578")
        private static Stereotype MDAASSOCDEP;

        @objid ("6dc56f52-bcb9-4d8e-b428-7f117d4bb87c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("416e28a8-7f78-4b95-b26e-69eb9b599407")
=======
        @objid ("d77a5998-4b2c-4579-adce-386641b71486")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0cffc56e-056d-477e-a47e-663c7457380e")
        public static TagType ASSESSMENTTIME_TAGTYPE_ELT;

        @objid ("6af41d4e-e348-44b9-a03f-7b53e7c78168")
        private static Stereotype MDAASSOCDEP;

        @objid ("9a0007de-d805-4f26-89fd-f38d9619d87c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b560dc46-1872-4f54-99bd-a580f009ebd5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe591c4e-317f-4202-9f7a-43dff0e6d7fe");
            ASSESSMENTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fc352744-f101-466f-a61c-0b32b9269a34");
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
