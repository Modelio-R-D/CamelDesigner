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
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance;
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
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
 * Proxy class to handle a {@link Class} with << Measurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fd364a84-8a23-4f50-a661-f2ea77419f95")
public abstract class Measurement extends FeatureClass {
<<<<<<< HEAD
    @objid ("d1ccb827-af8c-4aa8-901e-6bfe4fd7b7b5")
    public static final String STEREOTYPE_NAME = "Measurement";

    @objid ("60389b65-5f6f-469f-80dd-2460190ef1eb")
    public static final String MEASUREMENTTIME_TAGTYPE = "measurementTime";

    @objid ("bf7ca68d-334f-42d2-811c-cc6d7634f03b")
=======
    @objid ("99a17ef2-4da9-47c6-bb6d-2da56e3af259")
    public static final String STEREOTYPE_NAME = "Measurement";

    @objid ("e5371f93-53a7-4936-835e-35be92bc7e59")
    public static final String MEASUREMENTTIME_TAGTYPE = "measurementTime";

    @objid ("feb63bfb-4c0f-452b-93e8-af0250051f94")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link Measurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Measurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("1c2c292b-7325-47fc-b188-ca4b5d0aadbc")
=======
    @objid ("c628d50c-5caa-4e04-b0e9-2c995cacda10")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Measurement.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("8863776e-bdfa-43a9-94b6-96c75e924bcc")
=======
    @objid ("b56f2605-4f22-4fe6-9237-9f46fea22ad1")
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
        Measurement other = (Measurement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("36a9c2bd-cd11-45a1-950f-badb3a26736c")
=======
    @objid ("a9837374-7eaa-4e93-8f5c-e39619172156")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'eventInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("29caeaa3-9793-41ec-b042-c47e8d347867")
=======
    @objid ("fc9c1aa6-b6be-4de5-9ba5-335867266bb4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public EventInstance getEventInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Measurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Measurement.MdaTypes.MDAASSOCDEP_ROLE), "eventInstance")){
                  if (FunctionalEventInstance.canInstantiate(d.getDependsOn()))
                     return (FunctionalEventInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), FunctionalEventInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (NonFunctionalEventInstance.canInstantiate(d.getDependsOn()))
                     return (NonFunctionalEventInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), NonFunctionalEventInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'measurementTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("1f67dac9-1add-4aeb-8da8-7abecf67ef29")
=======
    @objid ("945a49d7-8853-4e23-bc03-fea2f0283853")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getMeasurementTime() {
        return this.elt.getTagValue(Measurement.MdaTypes.MEASUREMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("3774ba0e-c429-46cc-9406-daa48c9cbb91")
=======
    @objid ("9b335d5f-2366-4074-b479-cf43d30dee45")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public MetricInstance getMetricInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Measurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Measurement.MdaTypes.MDAASSOCDEP_ROLE), "metricInstance")){
                  if (SecurityMetricInstance.canInstantiate(d.getDependsOn()))
                     return (SecurityMetricInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityMetricInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricInstance.canInstantiate(d.getDependsOn()))
                     return (MetricInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("6db74d1c-5f8c-4e6f-a70a-919a379c9b18")
=======
    @objid ("a942674a-30e6-472d-9ab3-21ecaa2aaac7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getValue() {
        return this.elt.getTagValue(Measurement.MdaTypes.VALUE_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("83a32630-f51e-45aa-aa40-1eddce3051a4")
=======
    @objid ("c0e2a028-947e-434c-8993-af80b7186871")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'eventInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("3a7fbb57-03a3-43d6-8241-a488bbd72a91")
=======
    @objid ("3a799e44-2469-4161-b893-1eac1454a62d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setEventInstance(final EventInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Measurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Measurement.MdaTypes.MDAASSOCDEP_ROLE), "eventInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Measurement.MdaTypes.MDAASSOCDEP);
              dep.setName("eventInstance");      dep.putTagValue(Measurement.MdaTypes.MDAASSOCDEP_ROLE, "eventInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'measurementTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("48a47566-dc4f-45c4-9608-2b43fc0ab2ff")
=======
    @objid ("f9c8abfb-1821-4c3b-b261-bfc8fa3d34d4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setMeasurementTime(final String value) {
        this.elt.putTagValue(Measurement.MdaTypes.MEASUREMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("549dd644-7793-4eb1-bc24-fe30cd2a2c1e")
=======
    @objid ("44b56694-d538-4d66-830c-6e1c32983ea5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setMetricInstance(final MetricInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Measurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Measurement.MdaTypes.MDAASSOCDEP_ROLE), "metricInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Measurement.MdaTypes.MDAASSOCDEP);
              dep.setName("metricInstance");      dep.putTagValue(Measurement.MdaTypes.MDAASSOCDEP_ROLE, "metricInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("59eb6bbc-e76a-4586-b107-37307accfe02")
=======
    @objid ("9c925a1a-c328-47a0-85ec-a24b0542cf37")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setValue(final String value) {
        this.elt.putTagValue(Measurement.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("02510881-80fc-40cc-928e-76857fcf5dbd")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("22241754-2a2d-4b44-a967-3937b9da41ae")
=======
    @objid ("351d5c94-ba43-4aa0-9651-7efe6d567437")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Measurement(final Class elt) {
        super(elt);
    }

    @objid ("c5c12d99-af0a-463a-876e-c2847d9efbb0")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("d07c07e1-7bff-46bc-8c57-06df9175a674")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("897ff140-e1aa-4449-a13c-a606f6814253")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("1c0fae51-20b0-4a90-8ad0-8df4a59586d4")
        public static TagType MEASUREMENTTIME_TAGTYPE_ELT;

        @objid ("fa86c28f-0706-4b22-8aa9-7fd5725ca5d4")
        private static Stereotype MDAASSOCDEP;

        @objid ("d2982cad-af93-497f-893b-8b8354a8056a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d21761b-f8f4-4a06-ab4a-521bdd04d669")
=======
        @objid ("d876ee6e-9e2e-4957-b6be-5426732cc2cf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0de5fa5e-5d62-48be-90f7-d08942246758")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("39b259b3-8a8c-4f1d-8e48-797056f03e84")
        public static TagType MEASUREMENTTIME_TAGTYPE_ELT;

        @objid ("0698cd5c-4c25-4bb6-9dbd-92d0b469faa3")
        private static Stereotype MDAASSOCDEP;

        @objid ("6cda51fc-bcc2-400c-b1b7-f9f51a4c33f1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1a085645-8def-47be-ab73-ad45f3646e2d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "481e52bb-d5b3-4dcb-a365-8ca5d75d8ac2");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03f06745-0e69-475c-a468-9f73b761a5d0");
            MEASUREMENTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "501b05dc-7f34-42e0-9da5-3a581c881e5c");
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
