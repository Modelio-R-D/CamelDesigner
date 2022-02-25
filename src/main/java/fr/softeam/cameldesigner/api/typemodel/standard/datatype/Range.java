/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << Range >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b6624bb7-0982-4bff-af96-a190c5237803")
public class Range extends ValueType {
    @objid ("244aa6f4-bc80-4d9d-9734-7b3225795134")
    public static final String STEREOTYPE_NAME = "Range";

    @objid ("e3ce354a-f9cb-4e2e-9d73-4860395e263e")
    public static final String LOWERLIMIT_TAGTYPE = "lowerLimit";

    @objid ("f8532eb3-5de1-4a6f-8564-feb84c0df31d")
    public static final String UPPERLIMIT_TAGTYPE = "upperLimit";

    /**
     * Tells whether a {@link Range proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Range >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bc1565ab-57e0-4325-8bf0-05875b0f24a7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Range.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Range >> then instantiate a {@link Range} proxy.
     * 
     * @return a {@link Range} proxy on the created {@link DataType}.
     */
    @objid ("cdd7f706-ebe8-40c1-9127-810b203abe44")
    public static Range create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Range.STEREOTYPE_NAME);
        return Range.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link Range} proxy from a {@link DataType} stereotyped << Range >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link Range} proxy or <i>null</i>.
     */
    @objid ("3a16e8cd-d1db-4921-b263-88ff6f18b024")
    public static Range instantiate(final DataType obj) {
        return Range.canInstantiate(obj) ? new Range(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Range} proxy from a {@link DataType} stereotyped << Range >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link Range} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ab8905d5-17c7-4465-b214-9b562b74ad61")
    public static Range safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (Range.canInstantiate(obj))
        	return new Range(obj);
        else
        	throw new IllegalArgumentException("Range: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b39e801a-4b32-4355-9245-082353c347e3")
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
        Range other = (Range) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("61567588-d25d-43bb-8c9f-696f966c1136")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'lowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2c39fa2a-cb41-4e5d-821b-dee79ee5435b")
    public String getLowerLimit() {
        return this.elt.getTagValue(Range.MdaTypes.LOWERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'upperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3b7e0f62-cd2b-4bff-adc9-b2cdd866c2fb")
    public String getUpperLimit() {
        return this.elt.getTagValue(Range.MdaTypes.UPPERLIMIT_TAGTYPE_ELT);
    }

    @objid ("4341f1b9-dfcc-4d2e-be78-4393cf2905d1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'lowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("abf187ee-a8b4-43ec-b1e6-ea7426fcc97d")
    public void setLowerLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.LOWERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'upperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("06953a51-17ab-4d5e-9d98-2e3fb16e08bd")
    public void setUpperLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.UPPERLIMIT_TAGTYPE_ELT, value);
    }

    @objid ("61ff41d5-4aa8-49d0-bfe9-9825bf06ec39")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("5e13ebeb-e847-4504-8ff5-36603ac5a93d")
    protected Range(final DataType elt) {
        super(elt);
    }

    @objid ("f119cedf-8e67-4a07-b5a8-ffaf11158aa4")
    public static final class MdaTypes {
        @objid ("792140df-6aca-4310-b532-049351bd4283")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("165ae64d-cc70-4c4f-bc2f-5bb6d936e92e")
        public static TagType LOWERLIMIT_TAGTYPE_ELT;

        @objid ("ad41cc65-bed1-49bd-a88a-064ca4109966")
        public static TagType UPPERLIMIT_TAGTYPE_ELT;

        @objid ("06ae4406-1cd6-4142-844c-a4e64635a555")
        private static Stereotype MDAASSOCDEP;

        @objid ("ac6cd20e-c5f6-4065-a519-99b5fc021f48")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a7996a68-a07b-43c4-a673-b3bf8fe4f34d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ea69f465-8f51-41c3-9c81-cc30270ea9cb");
            LOWERLIMIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f6f57467-6d1e-4bb7-9266-0e11d1e1c7dd");
            UPPERLIMIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8205fd1c-29b3-4558-954d-bd9f8cd79610");
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
