{{- define "rest-controller.name" -}}
{{ .Chart.Name }}
{{- end -}}

{{- define "rest-controller.fullname" -}}
{{ .Release.Name }}-{{ .Chart.Name }}
{{- end -}}
