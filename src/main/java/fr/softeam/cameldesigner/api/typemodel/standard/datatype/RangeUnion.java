/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
 * Proxy class to handle a {@link DataType} with << RangeUnion >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("418feac3-a018-487d-af79-66ed2a10b317")
public class RangeUnion extends ValueType {
    @objid ("0006418c-8937-4257-a086-8b26586fe644")
    public static final String STEREOTYPE_NAME = "RangeUnion";

    /**
     * Tells whether a {@link RangeUnion proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << RangeUnion >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8eccf5e7-89cb-4fee-9865-23219f522671")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RangeUnion.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << RangeUnion >> then instantiate a {@link RangeUnion} proxy.
     * 
     * @return a {@link RangeUnion} proxy on the created {@link DataType}.
     */
    @objid ("f91af4be-7dcb-40e0-9d77-f7cc06b2a1b8")
    public static RangeUnion create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RangeUnion.STEREOTYPE_NAME);
        return RangeUnion.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link RangeUnion} proxy from a {@link DataType} stereotyped << RangeUnion >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link RangeUnion} proxy or <i>null</i>.
     */
    @objid ("7daf2215-0e68-42aa-a026-62bb145e62d6")
    public static RangeUnion instantiate(final DataType obj) {
        return RangeUnion.canInstantiate(obj) ? new RangeUnion(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RangeUnion} proxy from a {@link DataType} stereotyped << RangeUnion >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link RangeUnion} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bcd9cc0a-8ad4-4e43-933d-5009ace92f25")
    public static RangeUnion safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (RangeUnion.canInstantiate(obj))
        	return new RangeUnion(obj);
        else
        	throw new IllegalArgumentException("RangeUnion: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("db310e7c-0e73-482f-8cbc-e82e5c60a3a9")
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
        RangeUnion other = (RangeUnion) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("549b8413-2d52-4faf-bf33-5da27631ffe6")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("69974c8a-c3ee-4bbb-9f80-7e1470f7f08a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("80de2d45-3301-44b5-b4f9-7c71a9204e8a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("ca839a19-a0ca-4b86-9c87-76a667a157ba")
    protected RangeUnion(final DataType elt) {
        super(elt);
    }

    @objid ("a86c3c8e-3fec-4d3f-8ea5-0137b2bd07d5")
    public static final class MdaTypes {
        @objid ("7b761bf2-a8c9-4bd7-8165-f9f52e5fbd23")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c91c68f8-0f86-4c51-9eb9-cc6a1b003be2")
        private static Stereotype MDAASSOCDEP;

        @objid ("a162ea66-2054-4f1b-8632-64cd651671cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7e347d51-c8ca-4cd2-906f-e79f105c2202")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aeb307d4-49c6-4201-b285-a8ba93b291fb");
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
