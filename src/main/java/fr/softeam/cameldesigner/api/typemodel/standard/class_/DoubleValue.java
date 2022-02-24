/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << DoubleValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cc20daad-6f47-4d3a-babd-121eb172a4cb")
public class DoubleValue extends NumericValue {
    @objid ("2947a650-abeb-4e84-8feb-b1255a9cdd9a")
    public static final String STEREOTYPE_NAME = "DoubleValue";

    @objid ("7d474f74-8ffa-4ebe-b198-beb67b0c9fe3")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link DoubleValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DoubleValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("865a71de-7619-4d7c-adf1-3e25fe6cef02")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DoubleValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DoubleValue >> then instantiate a {@link DoubleValue} proxy.
     * 
     * @return a {@link DoubleValue} proxy on the created {@link Class}.
     */
    @objid ("7e67cdf3-67d0-44e6-9327-eb7b66ebb63f")
    public static DoubleValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DoubleValue.STEREOTYPE_NAME);
        return DoubleValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link DoubleValue} proxy from a {@link Class} stereotyped << DoubleValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link DoubleValue} proxy or <i>null</i>.
     */
    @objid ("606aa978-a0c7-4ddd-a9d4-474b53d3e2e4")
    public static DoubleValue instantiate(final Class obj) {
        return DoubleValue.canInstantiate(obj) ? new DoubleValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DoubleValue} proxy from a {@link Class} stereotyped << DoubleValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link DoubleValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9b0dee41-98e0-4dff-8a4b-bebb3767d9ee")
    public static DoubleValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DoubleValue.canInstantiate(obj))
        	return new DoubleValue(obj);
        else
        	throw new IllegalArgumentException("DoubleValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("98fd500d-9530-4b5e-bb9e-b8e58c18121b")
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
        DoubleValue other = (DoubleValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8c8c1ff6-9988-4839-9ed8-2ccc88e486ed")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6d815a7d-8da3-48be-b331-153fc7afab0a")
    public String getValue() {
        return this.elt.getTagValue(DoubleValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("7cf8c0f9-525f-47c9-9eba-0a16071b4b1c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d45b7e72-da52-4175-8c4f-3b719bebf6ff")
    public void setValue(final String value) {
        this.elt.putTagValue(DoubleValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("e02c89ad-5a2f-4ed4-a758-e68b39dfce52")
    protected DoubleValue(final Class elt) {
        super(elt);
    }

    @objid ("0478aee9-2727-4d68-be3a-307572bc0a9f")
    public static final class MdaTypes {
        @objid ("5fd2e8b0-d321-4156-864d-e0a09974ee4c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("34d5d0ff-572c-4e70-85fb-48bfbeb62516")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("e68085fe-2efd-4d3d-92cc-8d7a64c72152")
        private static Stereotype MDAASSOCDEP;

        @objid ("23e5e1c6-7666-4687-ab0d-2aa929c159f0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a9128369-1bca-4594-85b2-ddffb389afc9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6f7f3c3b-3812-4284-9665-7696d52500f2");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8e0fd000-262b-4aa6-9b35-fea753d10683");
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
