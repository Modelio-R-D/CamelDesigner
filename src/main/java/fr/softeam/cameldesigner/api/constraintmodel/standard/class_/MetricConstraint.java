/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.0.10

 * This file was generated on 7/24/20 11:19 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.class_;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << MetricConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9eea58eb-b81c-46fb-982b-983b868d5bf1")
public class MetricConstraint extends UnaryConstraint {
    @objid ("e43e7ac6-7ec1-493e-b22f-d69cab4cda7d")
    public static final String STEREOTYPE_NAME = "MetricConstraint";

    /**
     * Tells whether a {@link MetricConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricConstraint >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6705e3ed-fbf5-4e5d-b73b-ecbdc707ebd7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricConstraint >> then instantiate a {@link MetricConstraint} proxy.
     * 
     * @return a {@link MetricConstraint} proxy on the created {@link Class}.
     */
    @objid ("2bb7d21e-1ae3-4c7d-9647-2ca70381b138")
    public static MetricConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricConstraint.STEREOTYPE_NAME);
        return MetricConstraint.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MetricConstraint} proxy from a {@link Class} stereotyped << MetricConstraint >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link MetricConstraint} proxy or <i>null</i>.
     */
    @objid ("d2cd8854-e419-4da5-95b8-6bcb2280ca1c")
    public static MetricConstraint instantiate(final Class obj) {
        return MetricConstraint.canInstantiate(obj) ? new MetricConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricConstraint} proxy from a {@link Class} stereotyped << MetricConstraint >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link MetricConstraint} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4e782417-8c83-4eee-aeab-9584c9683a45")
    public static MetricConstraint safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MetricConstraint.canInstantiate(obj))
            return new MetricConstraint(obj);
        else
            throw new IllegalArgumentException("MetricConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8192e3f7-a8aa-49cb-b514-23cc0a3756bc")
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
        MetricConstraint other = (MetricConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("da3ef894-7dff-4109-b38c-62caf870d6c8")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("6c71c986-78bb-4c46-9b33-4b3de70d65fa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5120d101-c517-4893-a73c-527c50c6bb96")
    protected MetricConstraint(final Class elt) {
        super(elt);
    }

    @objid ("2585cc96-b03d-44fa-80b6-4370c0babd49")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("b57d0c10-825b-4f65-b00e-10374916ee15")
    public static final class MdaTypes {
        @objid ("7e1ad64b-6b62-4643-9630-6b380600b68c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9e9ef544-3fa6-4df3-9275-75875e3a3dac")
        private static Stereotype MDAASSOCDEP;

        @objid ("3be4a974-1df2-404b-83d6-59773a09b2b3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("42a20d3b-4ec9-4cce-8784-1e1501b18117")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a9388a13-87a4-45e7-9557-819ce8efc3da");
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
