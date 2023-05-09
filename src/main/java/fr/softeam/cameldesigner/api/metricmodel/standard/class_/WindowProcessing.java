/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("57855d69-9c2c-4a5d-a041-5daa6e996b3c")
    public static final String STEREOTYPE_NAME = "WindowProcessing";

    @objid ("7de4832c-c467-47de-a872-99be15abd14a")
    public static final String PROCESSINGTYPE_TAGTYPE = "processingType";

    /**
     * Tells whether a {@link WindowProcessing proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << WindowProcessing >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e181006d-2b59-4eb7-92d3-7430e4b17704")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, WindowProcessing.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << WindowProcessing >> then instantiate a {@link WindowProcessing} proxy.
     * 
     * @return a {@link WindowProcessing} proxy on the created {@link Class}.
     */
    @objid ("23df3fe6-1510-410f-a91a-df2a7fd2fdcd")
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
    @objid ("dd4c610a-98c7-4318-8076-70bea6bfda10")
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
    @objid ("c5bebe51-cf09-4e46-86c6-06c7161d4abe")
    public static WindowProcessing safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (WindowProcessing.canInstantiate(obj))
        	return new WindowProcessing(obj);
        else
        	throw new IllegalArgumentException("WindowProcessing: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0ff7ab10-4f26-4d58-bccc-473103802f9f")
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
    @objid ("e5588e55-5c14-4c31-ac1b-9b64ee703468")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'processingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("52489ecc-b55e-4a83-9e6c-bc619cda4d77")
    public String getProcessingType() {
        return this.elt.getTagValue(WindowProcessing.MdaTypes.PROCESSINGTYPE_TAGTYPE_ELT);
    }

    @objid ("31fe2898-13af-4087-8b3e-6f7cee51331c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'processingType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("26080eb7-b86c-4950-a549-14fa836efe97")
    public void setProcessingType(final String value) {
        this.elt.putTagValue(WindowProcessing.MdaTypes.PROCESSINGTYPE_TAGTYPE_ELT, value);
    }

    @objid ("55f50f76-2716-4f12-a2ae-3362c3b4e4d1")
    protected WindowProcessing(final Class elt) {
        super(elt);
    }

    @objid ("dbccbbf4-b3b0-492c-9045-169706c9165d")
    public static final class MdaTypes {
        @objid ("78190a87-87e1-49a9-b7fd-b4fcfcf875ba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d60de215-0bbf-4839-b049-79796f1422a2")
        public static TagType PROCESSINGTYPE_TAGTYPE_ELT;

        @objid ("c58cea36-82b6-4425-8d69-889290ce597c")
        private static Stereotype MDAASSOCDEP;

        @objid ("129aea18-db37-4be5-9710-c70894e74efb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b0383ddb-eda6-4634-8339-7857755d2008")
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
