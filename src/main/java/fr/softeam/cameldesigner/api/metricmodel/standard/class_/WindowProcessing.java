/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("1e7b23f3-bfb2-40fc-94d7-a50a5cb9e7b9")
    public static final String STEREOTYPE_NAME = "WindowProcessing";

    @objid ("dd6e643f-cc06-4e61-bc64-3c505f7325db")
    public static final String PROCESSINGTYPE_TAGTYPE = "processingType";

    /**
     * Tells whether a {@link WindowProcessing proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << WindowProcessing >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("03dac4c1-6b5e-4aba-9ab6-42d9ac721a4b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, WindowProcessing.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << WindowProcessing >> then instantiate a {@link WindowProcessing} proxy.
     * 
     * @return a {@link WindowProcessing} proxy on the created {@link Class}.
     */
    @objid ("d9bc8551-948a-40a3-97f4-d916327b7ffc")
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
    @objid ("ea50fb44-2c14-46c9-bcad-52ed7801f93c")
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
    @objid ("4ff51cfb-3de3-4eca-b13d-f22b90487a92")
    public static WindowProcessing safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (WindowProcessing.canInstantiate(obj))
        	return new WindowProcessing(obj);
        else
        	throw new IllegalArgumentException("WindowProcessing: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c1243726-c194-44db-9b76-ff3ddd0083da")
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
    @objid ("6e8da05f-8135-4bb3-aa93-77d10b976a19")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'processingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8a882ea8-4089-4b1f-9816-1099e6fae211")
    public String getProcessingType() {
        return this.elt.getTagValue(WindowProcessing.MdaTypes.PROCESSINGTYPE_TAGTYPE_ELT);
    }

    @objid ("b9b6e728-901c-4c1b-8c17-109a0d650c61")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'processingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aa53005a-0cdc-4e53-8b51-b4745b0a2bd1")
    public void setProcessingType(final String value) {
        this.elt.putTagValue(WindowProcessing.MdaTypes.PROCESSINGTYPE_TAGTYPE_ELT, value);
    }

    @objid ("f849e3ee-8994-488d-b688-1f0b353aea6f")
    protected WindowProcessing(final Class elt) {
        super(elt);
    }

    @objid ("dbccbbf4-b3b0-492c-9045-169706c9165d")
    public static final class MdaTypes {
        @objid ("08949446-753e-47df-b91b-4a9a5eeba7d2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("29fd61bf-4603-4744-9076-d69be828913a")
        public static TagType PROCESSINGTYPE_TAGTYPE_ELT;

        @objid ("01ce82b1-d8ba-4e65-89af-253908d4eb45")
        private static Stereotype MDAASSOCDEP;

        @objid ("175ea7ac-6566-4ffd-8e7b-3ee3568fbd8d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4e9b6be7-c6ff-41c8-a344-52c9bcbebf6f")
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
