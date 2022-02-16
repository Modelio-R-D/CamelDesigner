/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("86c64776-224c-4e4c-8f8e-47b249c95872")
    public static final String STEREOTYPE_NAME = "ConstraintModel";

    /**
     * Tells whether a {@link ConstraintModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ConstraintModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("006f3f6d-ddd4-4183-a72d-78d92673fea8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ConstraintModel >> then instantiate a {@link ConstraintModel} proxy.
     * 
     * @return a {@link ConstraintModel} proxy on the created {@link Package}.
     */
    @objid ("bd4df717-80c9-48ce-8047-86e45ee7b062")
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
    @objid ("e0a5629a-b361-4113-85c8-e45a58daf8a5")
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
    @objid ("4a3a372a-7541-4245-8bdd-d9bd14d01499")
    public static ConstraintModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ConstraintModel.canInstantiate(obj))
        	return new ConstraintModel(obj);
        else
        	throw new IllegalArgumentException("ConstraintModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0c274569-820a-4e63-a559-e0b5e5cbd117")
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
    @objid ("4768af74-79b7-4773-afb2-5d218256cdfc")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("66fb9d89-a299-46cc-9c9d-338d0ed51e79")
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

    @objid ("fb253311-c597-4b4d-86de-7d8e7fd13a18")
    protected ConstraintModel(final Package elt) {
        super(elt);
    }

    @objid ("ebe267b3-9ebc-4287-8f57-7be02738f119")
    public static final class MdaTypes {
        @objid ("89d76981-82f2-46df-aac2-a071e9999b1e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c9037ea9-be66-4bcc-b4c0-fc29e9326b15")
        private static Stereotype MDAASSOCDEP;

        @objid ("1fc85f6f-a6cd-4d54-8bfb-4accb76e8547")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("52677f8f-42e9-4630-8c69-e47cf544732a")
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
