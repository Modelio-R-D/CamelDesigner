/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("96eb0b79-9d1a-4b17-aa84-0a824d6139c0")
    public static final String STEREOTYPE_NAME = "Schedule";

    @objid ("e8d8060e-e329-48b4-832f-dcfc3f165f2f")
    public static final String END_TAGTYPE = "end";

    @objid ("b959f1fd-6fed-4c8a-8063-012be0069124")
    public static final String INTERVAL_TAGTYPE = "interval";

    @objid ("ae596090-f306-4581-8044-4c196b94b8ce")
    public static final String REPETITIONS_TAGTYPE = "repetitions";

    @objid ("cd3fe3e3-2220-4565-be3a-9dd1fd984c7d")
    public static final String START_TAGTYPE = "start";

    /**
     * Tells whether a {@link Schedule proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Schedule >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("212637bd-2b80-4f46-9dcc-cd90b792e79a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Schedule.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Schedule >> then instantiate a {@link Schedule} proxy.
     * 
     * @return a {@link Schedule} proxy on the created {@link Class}.
     */
    @objid ("323e421e-6a75-4261-9b15-24984256300c")
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
    @objid ("745b1bc0-0232-4cfd-8c5a-b84396be290e")
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
    @objid ("bfe938ad-80b5-4bc7-a1ca-7b4c56b84b14")
    public static Schedule safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Schedule.canInstantiate(obj))
        	return new Schedule(obj);
        else
        	throw new IllegalArgumentException("Schedule: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6011bb46-4068-4b41-b097-d9673cdf9e9b")
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
    @objid ("9a56a7ac-63c8-4c4a-b8f9-d1c41c3bd50b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'end'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9de064f6-d149-4f5c-b49b-9b06a6e5c4a8")
    public String getEnd() {
        return this.elt.getTagValue(Schedule.MdaTypes.END_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'interval'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fd5082cf-40a7-4248-aa61-23af7a9d86bc")
    public String getInterval() {
        return this.elt.getTagValue(Schedule.MdaTypes.INTERVAL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'repetitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b1e40442-9968-4fff-9a19-37b7778fb015")
    public String getRepetitions() {
        return this.elt.getTagValue(Schedule.MdaTypes.REPETITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'start'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8f301308-bdca-4577-9713-38028e217e90")
    public String getStart() {
        return this.elt.getTagValue(Schedule.MdaTypes.START_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("be2a6e2a-f761-4e37-ab1c-093c66508dd3")
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

    @objid ("0b940d5d-fc18-4618-85ae-b9bfe75b6806")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'end'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d09a5842-bd25-48a6-8276-5633cbc4da59")
    public void setEnd(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.END_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'interval'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c65a2c3e-36aa-4a64-baff-03587b3c412c")
    public void setInterval(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.INTERVAL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'repetitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("753cfb90-4f55-46ce-8ca9-c386f40e59d5")
    public void setRepetitions(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.REPETITIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'start'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("23487267-ed86-435b-8502-ab3e01fa3fd6")
    public void setStart(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.START_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("deb1d23b-9f9a-4790-9404-e704be2fffd7")
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

    @objid ("615c6871-7ac5-42ae-a419-5258bc870752")
    protected Schedule(final Class elt) {
        super(elt);
    }

    @objid ("0e156ba5-618a-44cd-8a09-9cb3cbf093ee")
    public static final class MdaTypes {
        @objid ("b22796e4-d107-4e4a-af6b-ccce251e9ba7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1fd91c2a-eaa2-4e25-999f-a95523ee8b44")
        public static TagType START_TAGTYPE_ELT;

        @objid ("7b3ca3fe-f0f7-4a59-95e2-bb1c555a7b77")
        public static TagType END_TAGTYPE_ELT;

        @objid ("a39b7151-0d43-4eac-9953-c718a4e6b90b")
        public static TagType REPETITIONS_TAGTYPE_ELT;

        @objid ("4f1c029c-4984-4c96-af63-fa7026169f88")
        public static TagType INTERVAL_TAGTYPE_ELT;

        @objid ("d7c71140-69d9-47d9-b89b-035662583c4c")
        private static Stereotype MDAASSOCDEP;

        @objid ("e191d878-426e-4a7e-ba95-ec2ff53bac54")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("36cbc952-e93d-4db9-826a-98acf572305f")
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
