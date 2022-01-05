/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance;
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
 * Proxy class to handle a {@link Instance} with << FunctionalEventInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a687c29e-c0ac-4bea-a2ad-2522f0f19aa9")
public class FunctionalEventInstance extends EventInstance {
    @objid ("91c2a934-21ce-4954-a295-8c30d2c69ece")
    public static final String STEREOTYPE_NAME = "FunctionalEventInstance";

    /**
     * Tells whether a {@link FunctionalEventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << FunctionalEventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("41580a85-427b-4690-ab08-a81cdab6054e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEventInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << FunctionalEventInstance >> then instantiate a {@link FunctionalEventInstance} proxy.
     * 
     * @return a {@link FunctionalEventInstance} proxy on the created {@link Instance}.
     */
    @objid ("ae7a3a81-396a-4c1c-9b4d-b1492262fb47")
    public static FunctionalEventInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEventInstance.STEREOTYPE_NAME);
        return FunctionalEventInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link FunctionalEventInstance} proxy from a {@link Instance} stereotyped << FunctionalEventInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Instance
     * @return a {@link FunctionalEventInstance} proxy or <i>null</i>.
     */
    @objid ("65018369-c41f-41cb-8e21-e75e3c18d1cb")
    public static FunctionalEventInstance instantiate(final Instance obj) {
        return FunctionalEventInstance.canInstantiate(obj) ? new FunctionalEventInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FunctionalEventInstance} proxy from a {@link Instance} stereotyped << FunctionalEventInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Instance}
     * @return a {@link FunctionalEventInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7ff74425-749f-4256-92d7-858a1330f68a")
    public static FunctionalEventInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (FunctionalEventInstance.canInstantiate(obj))
            return new FunctionalEventInstance(obj);
        else
            throw new IllegalArgumentException("FunctionalEventInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4e6d7cac-83eb-4b7d-8ecd-ecad6ccd92c8")
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
        FunctionalEventInstance other = (FunctionalEventInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'componentInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("c52da9c8-d70c-4fd0-9024-aceda4d30ff0")
    public ComponentInstance getComponentInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(FunctionalEventInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(FunctionalEventInstance.MdaTypes.MDAASSOCDEP_ROLE), "componentInstance")
                  && ComponentInstance.canInstantiate(d.getDependsOn())) {
                     return (ComponentInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ComponentInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Instance}.
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("e1ce932d-df3e-49ae-b690-ab52dec13281")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("b86ef9bc-cfee-4763-b701-c9bb401ceb22")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'componentInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("f2f6f0e2-2e50-43aa-be56-de71a40ebe19")
    public void setComponentInstance(final ComponentInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(FunctionalEventInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(FunctionalEventInstance.MdaTypes.MDAASSOCDEP_ROLE), "componentInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), FunctionalEventInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("componentInstance");      dep.putTagValue(FunctionalEventInstance.MdaTypes.MDAASSOCDEP_ROLE, "componentInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("0933bcc1-ffdf-473c-b5b9-465c232137e0")
    protected FunctionalEventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("ed13a09f-140c-4c2f-ac85-a6622bc8ebf8")
    public static final class MdaTypes {
        @objid ("5f14cba2-da63-46be-8291-e57c4cf8548c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("36eaf592-0587-4f3b-8e17-615da4bdc65a")
        private static Stereotype MDAASSOCDEP;

        @objid ("bcc2cffd-a9ed-4726-a1dd-4c3bc1dfef76")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1dbb8834-c375-4ca3-b03d-b9b48bc86c33")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b88afca5-ed15-48f1-a81b-29da4a453701");
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
