/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << ConstraintModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("86cc342f-3138-45c5-9f57-831a1ef207ca")
public class ConstraintModel extends SubModel {
    @objid ("7ab7029e-58b0-4c70-9e77-16f082ac1157")
    public static final String STEREOTYPE_NAME = "ConstraintModel";

    /**
     * Tells whether a {@link ConstraintModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ConstraintModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("99bc77dd-ea3b-4bc9-a7e6-c1b70daf3b39")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ConstraintModel >> then instantiate a {@link ConstraintModel} proxy.
     * 
     * @return a {@link ConstraintModel} proxy on the created {@link Package}.
     */
    @objid ("ee248cd6-a3de-41e3-bb56-f3f691e9cdc7")
    public static ConstraintModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModel.STEREOTYPE_NAME);
        return ConstraintModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link ConstraintModel} proxy from a {@link Package} stereotyped << ConstraintModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link ConstraintModel} proxy or <i>null</i>.
     */
    @objid ("5887dc5c-d202-4fa5-8381-afabcc61c9e3")
    public static ConstraintModel instantiate(final Package obj) {
        return ConstraintModel.canInstantiate(obj) ? new ConstraintModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConstraintModel} proxy from a {@link Package} stereotyped << ConstraintModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link ConstraintModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("62a6bdb1-15a2-4ceb-9be1-b83541a23254")
    public static ConstraintModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ConstraintModel.canInstantiate(obj))
        	return new ConstraintModel(obj);
        else
        	throw new IllegalArgumentException("ConstraintModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("72fb0709-5ee7-493b-8ee7-0e213a3221d7")
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
        ConstraintModel other = (ConstraintModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("32343a9e-b372-4315-9672-d4e8367e33f1")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("93df302c-c04a-4b1a-947d-71399114832e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9025f90d-62ce-4bbe-bd7b-0fd4343e9ec5")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("c25f0a19-1255-433f-80aa-105187157b78")
    protected ConstraintModel(final Package elt) {
        super(elt);
    }

    @objid ("ebe267b3-9ebc-4287-8f57-7be02738f119")
    public static final class MdaTypes {
        @objid ("a299ef28-f93e-4e56-abba-41ed0fb667ce")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("07d002fe-7616-43eb-8c63-248a40be596e")
        private static Stereotype MDAASSOCDEP;

        @objid ("ff6b9706-8125-4c10-b55c-eed6aa352966")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("955fdd4b-c777-416d-9cf9-80e50743b309")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0a13db20-02d0-45a2-954a-db10f14d206b");
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
