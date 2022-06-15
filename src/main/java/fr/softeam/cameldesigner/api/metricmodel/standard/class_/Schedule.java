/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
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
 * Proxy class to handle a {@link Class} with << Schedule >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("98c5a57b-bbdd-4a3e-ab7c-6767c10ff2bd")
public class Schedule extends FeatureClass {
    @objid ("b3ef5251-fb66-4ea1-806e-d9d956ae549d")
    public static final String STEREOTYPE_NAME = "Schedule";

    @objid ("fa189f2d-62fa-46af-a5d2-c48dbb235bf2")
    public static final String END_TAGTYPE = "end";

    @objid ("80f601bf-6c32-436f-b923-6682f37081ba")
    public static final String INTERVAL_TAGTYPE = "interval";

    @objid ("b5914155-f277-4258-ba83-bf1c985aa185")
    public static final String REPETITIONS_TAGTYPE = "repetitions";

    @objid ("c8689aeb-1f4a-423b-a35d-fcaa7db77e47")
    public static final String START_TAGTYPE = "start";

    /**
     * Tells whether a {@link Schedule proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Schedule >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("de4acbd0-5450-4990-853b-385a8ec3d4ee")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Schedule.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Schedule >> then instantiate a {@link Schedule} proxy.
     * 
     * @return a {@link Schedule} proxy on the created {@link Class}.
     */
    @objid ("71e907b1-9ca3-4c23-832a-8d7525d68690")
    public static Schedule create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Schedule.STEREOTYPE_NAME);
        return Schedule.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Schedule} proxy from a {@link Class} stereotyped << Schedule >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link Schedule} proxy or <i>null</i>.
     */
    @objid ("7aa4399b-5619-40e6-8a17-06bc2aece5de")
    public static Schedule instantiate(final Class obj) {
        return Schedule.canInstantiate(obj) ? new Schedule(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Schedule} proxy from a {@link Class} stereotyped << Schedule >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link Schedule} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6a75431c-d2d2-45f8-a94e-a44fb8a7ebdd")
    public static Schedule safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Schedule.canInstantiate(obj))
            return new Schedule(obj);
        else
            throw new IllegalArgumentException("Schedule: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f949b157-4d4b-49f3-8110-974f75766f41")
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
        Schedule other = (Schedule) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("73f34d25-99e2-4068-8afa-0c7179149e1e")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'end'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5524cb6f-36c0-4942-9365-6143ed35e90f")
    public String getEnd() {
        return this.elt.getTagValue(Schedule.MdaTypes.END_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'interval'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("806dc202-1bd8-478b-8a5b-d75a1db464d7")
    public String getInterval() {
        return this.elt.getTagValue(Schedule.MdaTypes.INTERVAL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'repetitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c95c41c9-ade0-42ef-9b2a-92d4414ebad4")
    public String getRepetitions() {
        return this.elt.getTagValue(Schedule.MdaTypes.REPETITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'start'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bdc0452c-bd1e-411a-b8af-fbaf99c6c2ee")
    public String getStart() {
        return this.elt.getTagValue(Schedule.MdaTypes.START_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     */
    @objid ("d35441e4-e274-4b86-a9dd-50ee84bfe9e7")
    public Unit getTimeUnit() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Schedule.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Schedule.MdaTypes.MDAASSOCDEP_ROLE), "timeUnit")){
                  if (SingleUnit.canInstantiate(d.getDependsOn()))
                     return (SingleUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SingleUnit.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CompositeUnit.canInstantiate(d.getDependsOn()))
                     return (CompositeUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeUnit.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Dimensionless.canInstantiate(d.getDependsOn()))
                     return (Dimensionless)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Dimensionless.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("54f06df0-a969-4ebc-b4fc-ce459c50a693")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'end'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("89bf60b7-fed2-465b-b410-308548739516")
    public void setEnd(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.END_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'interval'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f12ccc40-c7de-476a-a38d-d7992d74612d")
    public void setInterval(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.INTERVAL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'repetitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2831ddc5-97d6-4b10-9b66-d96a0f105d1c")
    public void setRepetitions(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.REPETITIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'start'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4fbab203-2bb7-4ca8-aecd-c74ebb1d22c3")
    public void setStart(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.START_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     */
    @objid ("70c15678-4607-449d-a0f4-a38dcb4f5f13")
    public void setTimeUnit(final Unit obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Schedule.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Schedule.MdaTypes.MDAASSOCDEP_ROLE), "timeUnit")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Schedule.MdaTypes.MDAASSOCDEP);
              dep.setName("timeUnit");      dep.putTagValue(Schedule.MdaTypes.MDAASSOCDEP_ROLE, "timeUnit");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("80ba0e9e-d2d3-4b58-9ead-c69e89ed0042")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("ac3c0d98-a494-4b39-8577-c4aa92e3ca95")
    protected Schedule(final Class elt) {
        super(elt);
    }

    @objid ("0e156ba5-618a-44cd-8a09-9cb3cbf093ee")
    public static final class MdaTypes {
        @objid ("942e36f3-1a32-4ef8-93ea-afe1f06d706e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f38997e0-61c6-4424-ae68-f9ffa3cc78b5")
        public static TagType START_TAGTYPE_ELT;

        @objid ("7e08b206-4a2b-47c0-bf1f-e1ad1cd12832")
        public static TagType END_TAGTYPE_ELT;

        @objid ("b9b761b0-1012-4996-9fe8-d1eda21d396d")
        public static TagType REPETITIONS_TAGTYPE_ELT;

        @objid ("2e64e040-8fe0-42ad-a2e6-6cf38ba2ce77")
        public static TagType INTERVAL_TAGTYPE_ELT;

        @objid ("a4b7ebe1-0157-46db-b831-42ffb54ade52")
        private static Stereotype MDAASSOCDEP;

        @objid ("51243233-1d1a-4570-8cf4-42db92d7817a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5925b81b-cc42-46aa-88cb-26c28f64deda")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cad43b0e-412b-4e89-9a37-e7e1cda6ca29");
            START_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "798817d7-1858-433c-924c-d2de04defbb5");
            END_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "508e2653-ea62-4c42-b280-044f60f4aa40");
            REPETITIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce32b74c-7bc9-4e7a-8a99-2834143aec80");
            INTERVAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db3b563e-906f-40b7-a3f1-970e008bdf2a");
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
