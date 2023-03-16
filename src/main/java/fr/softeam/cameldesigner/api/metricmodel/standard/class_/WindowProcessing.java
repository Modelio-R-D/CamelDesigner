/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
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
 * Proxy class to handle a {@link Class} with << WindowProcessing >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f113e6c8-cd00-4d66-8cb5-a656505426b9")
public class WindowProcessing extends FeatureClass {
    @objid ("e1eae19b-3f5b-4d47-8aff-3f05e74be3c2")
    public static final String STEREOTYPE_NAME = "WindowProcessing";

    @objid ("e8aa1ed0-e8fb-4799-9a90-04ea688b7ec3")
    public static final String PROCESSINGTYPE_TAGTYPE = "processingType";

    /**
     * Tells whether a {@link WindowProcessing proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << WindowProcessing >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0a120730-8391-4e2b-855a-6c39aa46f785")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, WindowProcessing.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << WindowProcessing >> then instantiate a {@link WindowProcessing} proxy.
     * 
     * @return a {@link WindowProcessing} proxy on the created {@link Class}.
     */
    @objid ("64acc3ed-dcd8-4994-8e85-b7e90d32d122")
    public static WindowProcessing create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, WindowProcessing.STEREOTYPE_NAME);
        return WindowProcessing.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link WindowProcessing} proxy from a {@link Class} stereotyped << WindowProcessing >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link WindowProcessing} proxy or <i>null</i>.
     */
    @objid ("b4808595-95b8-4595-87f2-4cdaaa9e04fe")
    public static WindowProcessing instantiate(final Class obj) {
        return WindowProcessing.canInstantiate(obj) ? new WindowProcessing(obj) : null;
    }

    /**
     * Tries to instantiate a {@link WindowProcessing} proxy from a {@link Class} stereotyped << WindowProcessing >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link WindowProcessing} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3d6adce7-651a-4f1b-9632-b83452194fe2")
    public static WindowProcessing safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (WindowProcessing.canInstantiate(obj))
        	return new WindowProcessing(obj);
        else
        	throw new IllegalArgumentException("WindowProcessing: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b7798dc1-3709-4576-8153-d9362b7feca7")
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
        WindowProcessing other = (WindowProcessing) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("afae1628-58e1-4e38-851a-41e39bdba068")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'processingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f921787a-93a0-4a6f-b088-64ef299608b3")
    public String getProcessingType() {
        return this.elt.getTagValue(WindowProcessing.MdaTypes.PROCESSINGTYPE_TAGTYPE_ELT);
    }

    @objid ("da66a210-f4c8-4b7e-86c2-d0f0d6e92bbb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'processingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b4caad5f-3b8b-4b1e-ab6d-78ce3d85657d")
    public void setProcessingType(final String value) {
        this.elt.putTagValue(WindowProcessing.MdaTypes.PROCESSINGTYPE_TAGTYPE_ELT, value);
    }

    @objid ("3eabdd75-750f-478f-aa1b-1aed7e2025c3")
    protected WindowProcessing(final Class elt) {
        super(elt);
    }

    @objid ("dbccbbf4-b3b0-492c-9045-169706c9165d")
    public static final class MdaTypes {
        @objid ("52048f11-60d4-45db-8dff-408aa86cdb16")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dd4597b2-1b70-4cda-a84f-fa97122d99e6")
        public static TagType PROCESSINGTYPE_TAGTYPE_ELT;

        @objid ("19d94f8c-d9ed-4ea4-967d-38b8ecff4f2a")
        private static Stereotype MDAASSOCDEP;

        @objid ("afb6b412-ee20-4126-8f05-234c564dc143")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("804c544b-98f1-461f-b7ad-134ea36aab29")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8e163b3c-95f2-4ae0-8a90-6158935ad859");
            PROCESSINGTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2dd7a1c-3777-4b6b-b26b-cebed9a58fa7");
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
