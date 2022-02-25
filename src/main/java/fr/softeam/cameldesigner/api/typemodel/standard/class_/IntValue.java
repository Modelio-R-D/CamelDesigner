/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link Class} with << IntValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("55226fdb-80c7-4d63-9159-946742bab14b")
public class IntValue extends NumericValue {
    @objid ("3095c407-49a5-450f-9b98-537b0c7bb155")
    public static final String STEREOTYPE_NAME = "IntValue";

    @objid ("402a56a3-8cc3-42ff-99c6-d5b1118ab447")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link IntValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << IntValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6fc71069-e1ac-4f36-842e-e6f1fc998ab7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, IntValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << IntValue >> then instantiate a {@link IntValue} proxy.
     * 
     * @return a {@link IntValue} proxy on the created {@link Class}.
     */
    @objid ("a882d3c1-5254-4ac5-bf79-6384f538041b")
    public static IntValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, IntValue.STEREOTYPE_NAME);
        return IntValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link IntValue} proxy from a {@link Class} stereotyped << IntValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link IntValue} proxy or <i>null</i>.
     */
    @objid ("08ee4acd-7dfc-4962-87fa-dfb162ccac62")
    public static IntValue instantiate(final Class obj) {
        return IntValue.canInstantiate(obj) ? new IntValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link IntValue} proxy from a {@link Class} stereotyped << IntValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link IntValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("548d9a70-f9a8-429a-8436-0775c2085fb3")
    public static IntValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (IntValue.canInstantiate(obj))
        	return new IntValue(obj);
        else
        	throw new IllegalArgumentException("IntValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a8ad6f9c-8451-4da9-b3b3-57d60c556220")
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
        IntValue other = (IntValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8c12ed3c-4e59-4d5e-9634-0c12b381ffe4")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d65113d5-06fd-49a6-b224-f2d4d51cea70")
    public String getValue() {
        return this.elt.getTagValue(IntValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("802e629a-2f75-41fe-b5ac-74281d76055a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("feff2fbc-6454-4607-ada0-5727f7d21bb1")
    public void setValue(final String value) {
        this.elt.putTagValue(IntValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("89266d0d-e2dd-4967-8812-75082aa2017a")
    protected IntValue(final Class elt) {
        super(elt);
    }

    @objid ("86784b93-598c-48c0-99d5-5e6867c51898")
    public static final class MdaTypes {
        @objid ("e517fdac-c9d4-4202-a294-c81e4fdca240")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("96f85ba7-b980-4005-966d-db71a6a72a7b")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("c6742481-2d1b-4d20-be4f-fe0ef96e2636")
        private static Stereotype MDAASSOCDEP;

        @objid ("8e72e788-848e-4614-b76c-6eab5d779f82")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("113bbe51-6284-4596-9016-ae28d558bf5d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "84b646d6-4b3e-4375-b9e3-8e6d650114b3");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8c63edd5-c470-41cc-a9bf-8eb948e832ba");
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
