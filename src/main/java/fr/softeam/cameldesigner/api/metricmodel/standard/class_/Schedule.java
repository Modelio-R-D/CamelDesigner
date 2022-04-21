/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("f930370f-021a-4aa5-b97e-4c8729a099b8")
    public static final String STEREOTYPE_NAME = "Schedule";

    @objid ("6f27e9bc-4627-4613-9890-05c1e39295ef")
    public static final String END_TAGTYPE = "end";

    @objid ("de691dff-3a0f-4006-a2fc-3af09e2c7509")
    public static final String INTERVAL_TAGTYPE = "interval";

    @objid ("8a18e8b0-2118-4bee-b678-44651640e97f")
    public static final String REPETITIONS_TAGTYPE = "repetitions";

    @objid ("8bb187c2-b320-43f9-97a8-5d19e53848bb")
    public static final String START_TAGTYPE = "start";

    /**
     * Tells whether a {@link Schedule proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Schedule >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("077fe772-37fd-423b-8c2d-7053f2731c40")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Schedule.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Schedule >> then instantiate a {@link Schedule} proxy.
     * 
     * @return a {@link Schedule} proxy on the created {@link Class}.
     */
    @objid ("0741f501-2910-4d1a-9e5d-c3a76fb9fe88")
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
    @objid ("57f6dc5b-63ff-4a41-a31c-00fa2459a95b")
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
    @objid ("0abf3163-9964-45b5-a17b-c5de56aacf17")
    public static Schedule safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Schedule.canInstantiate(obj))
            return new Schedule(obj);
        else
            throw new IllegalArgumentException("Schedule: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9fce49e3-3e21-4c90-94c0-7910e477ef93")
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
    @objid ("372830c6-155b-49a2-a364-4ffb3556affd")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'end'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("304b06d0-a828-4184-b0fe-e16956a35168")
    public String getEnd() {
        return this.elt.getTagValue(Schedule.MdaTypes.END_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'interval'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ad9f2721-7d47-42b7-ad51-15bc0a412554")
    public String getInterval() {
        return this.elt.getTagValue(Schedule.MdaTypes.INTERVAL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'repetitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4d2e02ca-2feb-432d-9142-42a6f2cca18b")
    public String getRepetitions() {
        return this.elt.getTagValue(Schedule.MdaTypes.REPETITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'start'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b74deeb3-6ea1-4575-98d9-b1ce40f0f614")
    public String getStart() {
        return this.elt.getTagValue(Schedule.MdaTypes.START_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     */
    @objid ("215d2850-04f8-4c15-8030-e49770bbb055")
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

    @objid ("74d9a1ac-11dd-47d7-b14d-f13394ed00cb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'end'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2aafec3b-3af1-40a9-a26c-f2f4672bd147")
    public void setEnd(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.END_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'interval'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c9c0efb2-324a-42b1-81eb-5ba997b16b2e")
    public void setInterval(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.INTERVAL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'repetitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("570db2ff-70d0-4209-bbc4-ce210f1963af")
    public void setRepetitions(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.REPETITIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'start'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9043db37-3487-4c63-be35-42a13fcfda96")
    public void setStart(final String value) {
        this.elt.putTagValue(Schedule.MdaTypes.START_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'timeUnit' role.<p>
     * Role description:
     * null
     */
    @objid ("43e5c858-7cb5-4457-8de3-9d0198f9b543")
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

    @objid ("bb39a091-b7a9-461a-8bdf-532a1f32ffe1")
    protected Schedule(final Class elt) {
        super(elt);
    }

    @objid ("0e156ba5-618a-44cd-8a09-9cb3cbf093ee")
    public static final class MdaTypes {
        @objid ("dbc7a8b5-5cda-4359-a796-0481ed516155")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cebfde7c-bf32-43eb-9f15-8ac2cdc685e7")
        public static TagType START_TAGTYPE_ELT;

        @objid ("97818de9-b7e0-44c0-bc41-fad6c561e9ca")
        public static TagType END_TAGTYPE_ELT;

        @objid ("f38ccd90-755a-4fc3-8066-842fe0d60590")
        public static TagType REPETITIONS_TAGTYPE_ELT;

        @objid ("d0e7dec9-b454-4f3a-90d5-4a8190a60644")
        public static TagType INTERVAL_TAGTYPE_ELT;

        @objid ("61821f78-18bf-41f5-817d-00c64ce8683e")
        private static Stereotype MDAASSOCDEP;

        @objid ("1b9b6c1f-b36c-4e1c-a756-762210c0b64d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("45eda8d7-42dd-4af4-ad01-1386017cd946")
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
