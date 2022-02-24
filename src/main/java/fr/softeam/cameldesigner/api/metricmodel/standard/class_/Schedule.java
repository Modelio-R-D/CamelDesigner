/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("0ac2a280-17e3-4f45-a675-4c7c9070d541")
    public static final String STEREOTYPE_NAME = "Schedule";

    @objid ("4f4b5c77-a190-4fa8-a2ac-d2ceb6747d09")
    public static final String END_TAGTYPE = "end";

    @objid ("58230424-b728-4205-b9d8-545fec0b2f6f")
    public static final String INTERVAL_TAGTYPE = "interval";

    @objid ("434f556c-57f1-4435-9d1c-dd586810be5d")
    public static final String REPETITIONS_TAGTYPE = "repetitions";

    @objid ("f4c08553-81a7-424b-a0a8-582d56d9ccb7")
    public static final String START_TAGTYPE = "start";

    /**
     * Tells whether a {@link Schedule proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Schedule >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9d079cd6-9888-444c-806f-9c7fad232389")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Schedule.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Schedule >> then instantiate a {@link Schedule} proxy.
     * 
     * @return a {@link Schedule} proxy on the created {@link Class}.
     */
    @objid ("b6ac3dc4-2670-4009-bf81-d0cdbcaf58e8")
    public static Schedule create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Schedule.STEREOTYPE_NAME);
        return Schedule.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Schedule} proxy from a {@link Class} stereotyped << Schedule >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Schedule} proxy or <i>null</i>.
     */
    @objid ("72dd7d6d-d5d5-42a7-89a4-c77f1ae75a60")
    public static Schedule instantiate(final Class obj) {
        return Schedule.canInstantiate(obj) ? new Schedule(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Schedule} proxy from a {@link Class} stereotyped << Schedule >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Schedule} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6249ac99-133d-4680-b471-e171d59e635a")
    public static Schedule safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Schedule.canInstantiate(obj))
        	return new Schedule(obj);
        else
        	throw new IllegalArgumentException("Schedule: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("68f25876-0cc0-46ad-8ca9-403ef27fdce9")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("87356709-3597-4664-89ed-6ecb52b68d07")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'end'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8b950d34-69c6-4bf5-bad8-6a8f9df8c720")
    public String getEnd() {
        return this.elt.getTagValue(Schedule.MdaTypes.END_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'interval'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("de417140-dc05-4766-b771-ed7f51654d7e")
    public String getInterval() {
        return this.elt.getTagValue(Schedule.MdaTypes.INTERVAL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'repetitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f2b5260a-e08a-4e03-a42c-f2b3f46dd0ea")
    public String getRepetitions() {
        return this.elt.getTagValue(Schedule.MdaTypes.REPETITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'start'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f49f23c0-b5b9-4722-b841-141e7041b041")
    public String getStart() {
        return this.elt.getTagValue(Schedule.MdaTypes.START_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a1fb9184-1325-4f64-b035-f0e8f961e60a")
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

    @objid ("55a49675-f74f-471a-adbe-15f3c5247be1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'end'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("63a05170-c403-4baf-8089-3cb544277442")
    public void setEnd(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.END_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'interval'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c1fc00cc-573d-43b2-a131-8aecc9bf3647")
    public void setInterval(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.INTERVAL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'repetitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("96f8186b-dc60-4f64-a214-7e817baa6aa3")
    public void setRepetitions(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.REPETITIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'start'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d11e251a-1386-441b-bdbb-02ea4b48d477")
    public void setStart(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.START_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8bf1304d-dcd2-46eb-9ce2-27bb851b073c")
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

    @objid ("a106dc04-fd21-4907-9280-8d37a9f9629d")
    protected Schedule(final Class elt) {
        super(elt);
    }

    @objid ("0e156ba5-618a-44cd-8a09-9cb3cbf093ee")
    public static final class MdaTypes {
        @objid ("d2c29d0d-4e66-43ce-b858-8862922dd4bd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("67fd34ba-fb5d-4f1b-b03b-42de739c072d")
        public static TagType START_TAGTYPE_ELT;

        @objid ("bc8c6de6-3b5a-4968-9bfa-67bb55dfed9e")
        public static TagType END_TAGTYPE_ELT;

        @objid ("854c8f52-9ed6-4260-b931-23d0f5d876e4")
        public static TagType REPETITIONS_TAGTYPE_ELT;

        @objid ("4bd5b8f0-9926-465a-a303-7d3eff114936")
        public static TagType INTERVAL_TAGTYPE_ELT;

        @objid ("302f7a82-7e78-4c6f-8737-ccd104d54e90")
        private static Stereotype MDAASSOCDEP;

        @objid ("abf62fd9-9144-4c17-832d-9438281ed391")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6802ab6b-2b56-4da4-b64f-4fc26c409c7a")
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
