/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
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
    @objid ("ca9a4e8c-80e0-4f8d-9094-638a056dd7b0")
    public static final String STEREOTYPE_NAME = "WindowProcessing";

    @objid ("b7cf7bce-f411-4077-af59-d16d801b34b7")
    public static final String PROCESSINGTYPE_TAGTYPE = "processingType";

    /**
     * Tells whether a {@link WindowProcessing proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << WindowProcessing >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4a9c43f9-2111-41bb-811a-d278bac8fd61")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, WindowProcessing.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << WindowProcessing >> then instantiate a {@link WindowProcessing} proxy.
     * 
     * @return a {@link WindowProcessing} proxy on the created {@link Class}.
     */
    @objid ("68c86dab-5e12-44ba-9ada-aac92111309c")
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
    @objid ("b94434cb-1e88-49e5-9124-235a55dc17b1")
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
    @objid ("61896e0e-0941-49fc-83cd-c7a88431b7ee")
    public static WindowProcessing safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (WindowProcessing.canInstantiate(obj))
        	return new WindowProcessing(obj);
        else
        	throw new IllegalArgumentException("WindowProcessing: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4476bbe4-8db0-4039-8d8f-a45de549f63e")
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
    @objid ("fd1129ab-1626-4241-9d9f-c0e074cbcf23")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'processingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("676bc5e4-6b43-4ff8-b0dd-81238c2ab608")
    public String getProcessingType() {
        return this.elt.getTagValue(WindowProcessing.MdaTypes.PROCESSINGTYPE_TAGTYPE_ELT);
    }

    @objid ("d50fa2e3-0b7a-4589-931d-ad3311e5c7c6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'processingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("66cf446c-9442-409b-9644-c172abe4193e")
    public void setProcessingType(final String value) {
        this.elt.putTagValue(WindowProcessing.MdaTypes.PROCESSINGTYPE_TAGTYPE_ELT, value);
    }

    @objid ("5f118e2e-2ef8-47a4-871e-bc65bdde7f51")
    protected WindowProcessing(final Class elt) {
        super(elt);
    }

    @objid ("dbccbbf4-b3b0-492c-9045-169706c9165d")
    public static final class MdaTypes {
        @objid ("a6ec6856-99b1-4076-8648-8fa3391e1af8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4eb7aacd-1ac5-47f8-b563-0ef297cc0950")
        public static TagType PROCESSINGTYPE_TAGTYPE_ELT;

        @objid ("c52e9bf3-eee9-419a-919b-6cac5a30cb56")
        private static Stereotype MDAASSOCDEP;

        @objid ("49a73375-a71d-4391-9aca-a359d0d97e86")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a9d415eb-3af4-4275-a364-04131f927fda")
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
