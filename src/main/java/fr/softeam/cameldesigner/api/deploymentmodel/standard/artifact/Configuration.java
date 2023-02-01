/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.artifact.FeatureArtifact;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
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
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << Configuration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ff4bc201-76db-4377-a971-521d2953d0c0")
public abstract class Configuration extends FeatureArtifact {
<<<<<<< HEAD
    @objid ("2640c82d-ac87-4805-a10f-f6d13ee79756")
=======
    @objid ("826e2656-308d-4467-8079-35d7df911a5d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Configuration";

    /**
     * Tells whether a {@link Configuration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << Configuration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("4829f350-9d6e-4f47-bc39-ee6ce1d3a432")
=======
    @objid ("5065f997-4801-4480-8520-d5f5d480a3ec")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Configuration.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("623460b9-7513-4ca3-97e7-47f69f2b4cbc")
=======
    @objid ("d775d9e4-5b4e-464f-8483-3b2288331e4b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
        Configuration other = (Configuration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("fc8b306d-9c71-4f15-86cf-18904a4bc7b8")
=======
    @objid ("84d24633-6558-41bf-9fdd-fe1b4aec13e3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

<<<<<<< HEAD
    /**
     * Get the value of the 'requirements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("376f9593-dbd2-4306-a865-f3a9285f5c83")
    public RequirementSet getRequirements() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Configuration.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Configuration.MdaTypes.MDAASSOCDEP_ROLE), "requirements")){
                  if (RequirementSet.canInstantiate(d.getDependsOn()))
                     return (RequirementSet)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RequirementSet.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("5562cab7-b578-4cbc-8fab-58e7dc79f882")
=======
    @objid ("99c9691b-0103-4b18-934e-53daf590fa0c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'requirements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("65ce4a32-912d-4056-8738-8886323fbe95")
    public void setRequirements(final RequirementSet obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Configuration.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Configuration.MdaTypes.MDAASSOCDEP_ROLE), "requirements")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Configuration.MdaTypes.MDAASSOCDEP);
              dep.setName("requirements");      dep.putTagValue(Configuration.MdaTypes.MDAASSOCDEP_ROLE, "requirements");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("c1aff3ed-63aa-43bd-935d-6abf1015ba26")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("2b58ec51-e45b-4150-b10a-818ace3b67b6")
=======
    @objid ("bcd640bb-ffb2-448b-b145-e00de97e6ded")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Configuration(final Artifact elt) {
        super(elt);
    }

    @objid ("58dae9c3-74db-4b4e-9dad-cd23280e68db")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("4a91ccbd-6417-4049-8568-f7feb213ddfa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("100f02b3-4482-446e-9456-7a6532e04702")
        private static Stereotype MDAASSOCDEP;

        @objid ("41e7a779-3ed0-454a-8324-18cee2bf7ecc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9c9b2770-cd07-4213-bf9f-0efd7a4d7270")
=======
        @objid ("c7924f0d-1ce9-44fc-b5d9-3717beee1e9f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4f51bd2e-61ef-4d4b-afbd-2c574b8ec32f")
        private static Stereotype MDAASSOCDEP;

        @objid ("96bcb067-caf3-4bf1-ab1d-f911392d4f05")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("999f885a-5ad6-44da-8dc2-2ae6b18969d7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "24d6edfb-e2bf-4e67-8c56-b051b479f16d");
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
