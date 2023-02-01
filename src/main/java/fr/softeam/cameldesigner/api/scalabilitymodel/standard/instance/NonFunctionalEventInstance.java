/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << NonFunctionalEventInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cb340abc-2e6f-40f5-b96e-5f3764d6d408")
public class NonFunctionalEventInstance extends EventInstance {
<<<<<<< HEAD
    @objid ("ed869036-3788-42ec-836e-1088d94e9324")
=======
    @objid ("019bd417-8c57-48cc-866e-6810350bf402")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "NonFunctionalEventInstance";

    /**
     * Tells whether a {@link NonFunctionalEventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << NonFunctionalEventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("d7fd7ad5-93f9-4b83-9b32-0dc094988f17")
=======
    @objid ("db00ce4a-fae5-4487-862f-ed0c2b43f061")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEventInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << NonFunctionalEventInstance >> then instantiate a {@link NonFunctionalEventInstance} proxy.
     * 
     * @return a {@link NonFunctionalEventInstance} proxy on the created {@link Instance}.
     */
<<<<<<< HEAD
    @objid ("58379d63-3aca-4ae3-af47-efecf823cb9f")
=======
    @objid ("71f20393-e31f-4379-b139-f7af3fe4e41b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static NonFunctionalEventInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEventInstance.STEREOTYPE_NAME);
        return NonFunctionalEventInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEventInstance} proxy from a {@link Instance} stereotyped << NonFunctionalEventInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link NonFunctionalEventInstance} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("df1585ee-be8d-404f-9379-3a941dc2501a")
=======
    @objid ("fb8e1324-dc91-4ac8-9d4e-ef0c41de19c1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static NonFunctionalEventInstance instantiate(final Instance obj) {
        return NonFunctionalEventInstance.canInstantiate(obj) ? new NonFunctionalEventInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEventInstance} proxy from a {@link Instance} stereotyped << NonFunctionalEventInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link NonFunctionalEventInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("dbf98eff-ecbe-46b8-a184-f642106dad82")
=======
    @objid ("3d80a260-9f7c-43e1-b9d4-5eedaf3eee6b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static NonFunctionalEventInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (NonFunctionalEventInstance.canInstantiate(obj))
        	return new NonFunctionalEventInstance(obj);
        else
        	throw new IllegalArgumentException("NonFunctionalEventInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("5d3c228e-511c-4b61-9cdc-3dd1fa695bb8")
=======
    @objid ("81f9a3ef-ee43-4668-b88a-a9acbc6e5299")
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
        NonFunctionalEventInstance other = (NonFunctionalEventInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("285f904d-b97d-4707-aa7e-6abb72c45db9")
=======
    @objid ("a7e8e20c-b084-47b8-8041-e17ab1388de9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("3dded3e6-87b8-4546-bc37-e36a7663c73a")
=======
    @objid ("32aa8be7-f348-4cf4-b69f-1d4bd26b012c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public MetricInstance getMetricInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(NonFunctionalEventInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(NonFunctionalEventInstance.MdaTypes.MDAASSOCDEP_ROLE), "metricInstance")){
                  if (SecurityMetricInstance.canInstantiate(d.getDependsOn()))
                     return (SecurityMetricInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityMetricInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricInstance.canInstantiate(d.getDependsOn()))
                     return (MetricInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

<<<<<<< HEAD
    @objid ("74afb67b-2dec-478b-b7b9-3f24501b0eec")
=======
    @objid ("9bace965-8188-4a84-b88a-0aa320de32a5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("88f027c0-79a7-40b8-9460-0dd279c1e9b2")
=======
    @objid ("e2d4c72f-af1f-41d4-8a87-f2ddd12c2ced")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setMetricInstance(final MetricInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(NonFunctionalEventInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(NonFunctionalEventInstance.MdaTypes.MDAASSOCDEP_ROLE), "metricInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), NonFunctionalEventInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("metricInstance");      dep.putTagValue(NonFunctionalEventInstance.MdaTypes.MDAASSOCDEP_ROLE, "metricInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("c87f9400-f405-40fb-ac91-09198235a143")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("44977e44-fe22-41e5-8348-13f91c566a87")
=======
    @objid ("4d342744-9f16-466d-93f0-b6f5b56288a2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected NonFunctionalEventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("115de52d-fac8-49f5-8245-053320b852b9")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("c6c7e41b-332d-4f87-8874-328c2c1ed932")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4b74328f-dbda-44fb-893c-047743fa2265")
        private static Stereotype MDAASSOCDEP;

        @objid ("71ed0f85-0d40-4eaa-aea0-c8d7224afab0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8d6aeafa-af58-48d3-a9ac-25f0c79d50a4")
=======
        @objid ("8f27979a-eaec-4c6d-8910-ecf24d9fcfaa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("184ab3d0-5d09-443b-93da-37d527348369")
        private static Stereotype MDAASSOCDEP;

        @objid ("1110a578-7cef-42aa-8c43-1de3fbb894c9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("08ff183a-c696-4aac-a3f1-fcd1677fa5ea")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d6b986dc-6dc7-40b3-b2a3-c0fe9f6add0e");
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
