/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
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
 * Proxy class to handle a {@link Class} with << Metric >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b0754957-bc68-473c-a808-aac4f2fd0421")
public abstract class Metric extends FeatureClass {
<<<<<<< HEAD
    @objid ("9929957e-2d82-429b-b021-bc5dbdec5b32")
=======
    @objid ("46e9ab4a-fdfc-418c-8982-6f89ff701ddd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Metric";

    /**
     * Tells whether a {@link Metric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Metric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("f1d81d90-b6a6-487f-821a-06390fe1a914")
=======
    @objid ("b92b6f38-b9ad-4032-8f24-45a9f5ffe066")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Metric.STEREOTYPE_NAME));
    }

    @objid ("43bfa8b2-07f8-4a67-aff4-1c2da852a345")
    public static Metric instantiate(final Class obj) {
        return CompositeMetric.canInstantiate(obj) ?  CompositeMetric.instantiate(obj) :
            MetricVariable.canInstantiate(obj) ?  MetricVariable.instantiate(obj) :
                RawMetric.canInstantiate(obj) ?  RawMetric.instantiate(obj) : null;
    }

<<<<<<< HEAD
    @objid ("983909e6-8319-43c1-a9e1-98cb7d77cf9b")
=======
    @objid ("8c9a3869-2ba7-42d9-b5cc-8b3c7459c146")
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
        Metric other = (Metric) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("19146cdb-0cb2-4c25-8b3a-492dfdf2014d")
=======
    @objid ("61bcd804-47f0-45ab-bfbc-37c108d94922")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'metricTemplate' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("7448fe3c-8e17-4031-8344-5c593ed36bc1")
=======
    @objid ("d08dcb71-3c18-4ab7-8503-d9fe66092dff")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public MetricTemplate getMetricTemplate() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Metric.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Metric.MdaTypes.MDAASSOCDEP_ROLE), "metricTemplate")){
                  if (MetricTemplate.canInstantiate(d.getDependsOn()))
                     return (MetricTemplate)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricTemplate.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

<<<<<<< HEAD
    @objid ("845eb986-3303-41fb-8369-51b43fd7f773")
=======
    @objid ("34bd2871-3da3-4dcc-8958-9a377cd8057c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'metricTemplate' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("1e2a8f9c-3852-4047-a471-81da04b06d40")
=======
    @objid ("e636f0b3-1ce4-4c38-8095-57435fc6d7d2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setMetricTemplate(final MetricTemplate obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Metric.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Metric.MdaTypes.MDAASSOCDEP_ROLE), "metricTemplate")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Metric.MdaTypes.MDAASSOCDEP);
              dep.setName("metricTemplate");      dep.putTagValue(Metric.MdaTypes.MDAASSOCDEP_ROLE, "metricTemplate");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("65b7b6c9-5383-4b1f-ba59-053dd76cfb95")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("66b5ced7-cbb9-4cbe-9f56-c827a9fab6e0")
=======
    @objid ("05030edc-4f14-4532-b77a-27d437dfeb8b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Metric(final Class elt) {
        super(elt);
    }

    @objid ("7453f2c0-0edc-453a-bbfc-bbc62bf7a06d")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("fbbfd734-6c2b-4625-8345-3bf8b356f606")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("11aa5823-23b9-4a9c-8367-80f09992d3f5")
        private static Stereotype MDAASSOCDEP;

        @objid ("eafe7990-ff01-44d9-89ed-e1855d3d554b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6b03a6c9-3381-40ab-9e53-8cb424f13153")
=======
        @objid ("c9fd1cef-9a95-40ed-b789-d0cc13a5955c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b990394d-5f11-4dfe-b1fb-f1635c6ec15a")
        private static Stereotype MDAASSOCDEP;

        @objid ("c0311c74-54cb-4c28-b06d-6c713d4591b9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0f763cf6-0e5a-4baa-869e-8fafd49c51bc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1603af9c-7b21-4da2-96b7-6607aa8066cc");
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
