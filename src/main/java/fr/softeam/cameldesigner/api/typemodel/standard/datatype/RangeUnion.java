/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("a2b0c402-4699-46b9-abf1-a2ff58905935")
    public static final String STEREOTYPE_NAME = "RangeUnion";

    /**
     * Tells whether a {@link RangeUnion proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << RangeUnion >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bdbda89b-6fef-4c33-bc5f-05078b9248e5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RangeUnion.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << RangeUnion >> then instantiate a {@link RangeUnion} proxy.
     * 
     * @return a {@link RangeUnion} proxy on the created {@link DataType}.
     */
    @objid ("54e66578-beee-410c-85db-ec6ed5533f5c")
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
    @objid ("75cadbca-5457-464d-b5cd-863c3bc58255")
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
    @objid ("d6be555f-c198-4a68-ab90-0b687ef10175")
    public static RangeUnion safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (RangeUnion.canInstantiate(obj))
        	return new RangeUnion(obj);
        else
        	throw new IllegalArgumentException("RangeUnion: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f49b5618-b789-45c3-bee8-69107b590257")
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
    @objid ("4c0e1154-13c1-4942-ad24-6d00766e6046")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("6a4af6ab-dcbd-46ab-a3e9-a746595632ce")
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

    @objid ("f49d829e-52f7-43ca-b3d1-86f81ad6b211")
    protected RangeUnion(final DataType elt) {
        super(elt);
    }

    @objid ("a86c3c8e-3fec-4d3f-8ea5-0137b2bd07d5")
    public static final class MdaTypes {
        @objid ("6a44ebb6-5038-474d-baa7-e7ed64e0ae86")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e8d926c0-03b3-4b3f-8ea9-0f215d912429")
        private static Stereotype MDAASSOCDEP;

        @objid ("5067ab6d-115c-4626-a488-a7ff769bfd07")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("10440390-6b71-47f1-9e28-29a0476b57c8")
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
