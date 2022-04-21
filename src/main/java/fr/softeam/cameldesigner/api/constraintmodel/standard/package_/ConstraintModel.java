/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("4a368322-2a08-4218-9131-24cca1083021")
    public static final String STEREOTYPE_NAME = "ConstraintModel";

    /**
     * Tells whether a {@link ConstraintModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ConstraintModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e09d1ba8-70b3-4c80-84d1-9539c2b01b3a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ConstraintModel >> then instantiate a {@link ConstraintModel} proxy.
     * 
     * @return a {@link ConstraintModel} proxy on the created {@link Package}.
     */
    @objid ("9ce93021-7cb4-4dc2-9c83-e25ab2a75c75")
    public static ConstraintModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModel.STEREOTYPE_NAME);
        return ConstraintModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link ConstraintModel} proxy from a {@link Package} stereotyped << ConstraintModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link ConstraintModel} proxy or <i>null</i>.
     */
    @objid ("6d8c52ed-ce43-422f-99ef-056f1562f3bb")
    public static ConstraintModel instantiate(final Package obj) {
        return ConstraintModel.canInstantiate(obj) ? new ConstraintModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConstraintModel} proxy from a {@link Package} stereotyped << ConstraintModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link ConstraintModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c6994188-62b7-47eb-aa38-901edbe4f80f")
    public static ConstraintModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ConstraintModel.canInstantiate(obj))
            return new ConstraintModel(obj);
        else
            throw new IllegalArgumentException("ConstraintModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ca77ed77-89d8-4dbf-aa81-6730d9e79896")
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
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("67b0923d-aa8c-400b-8b0a-2ff51679faed")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("806f68aa-e818-4035-b0ec-f4c3bd96483f")
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

    @objid ("387cd6a6-70a6-480b-b9e3-8d24ce201449")
    protected ConstraintModel(final Package elt) {
        super(elt);
    }

    @objid ("ebe267b3-9ebc-4287-8f57-7be02738f119")
    public static final class MdaTypes {
        @objid ("12b05195-07dc-44d3-952d-3c35b8345366")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("82d98719-c98e-4dc0-91f0-57422d8e957d")
        private static Stereotype MDAASSOCDEP;

        @objid ("6dd0af2e-5e27-41cc-8305-040ae446e891")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("226ab22d-5de1-482c-98bd-903f247765d3")
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
